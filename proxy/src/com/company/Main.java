package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Main {

  private static final String CONNECTION_STRING = "jdbc:custom:mysql://localhost:3306/";

  private static final String PROPS_FILE_PATH = "/home/alexrazinkov/projects/VSU/patterns/proxy/db.properties";

  private static final List<Pair<Character, String>> SIGN_TO_PROP = Arrays.asList(
    new Pair<>('?', "user"),
    new Pair<>('&', "password")
  );

  private static Connection getConnection(final String propsFilePath) throws SQLException {
    final Properties props = new Properties();
    try (final FileInputStream fis = new FileInputStream(PROPS_FILE_PATH)) {
      props.load(fis);
    } catch (IOException e) {
      e.printStackTrace();
    }

    final StringBuilder sb = new StringBuilder(CONNECTION_STRING).append(props.getProperty("db"));
    SIGN_TO_PROP.forEach(p -> {
      final String propName = p.getValue();
      sb.append(p.getKey()).append(propName).append('=').append(props.getProperty(propName));
    });

    return DriverManager.getConnection(sb.toString());
  }

  public static void main(String[] args) throws SQLException {
    final Connection conn;
    try {
      conn = getConnection(PROPS_FILE_PATH);
    } catch (SQLException e) {
      e.printStackTrace();
      return;
    }

    conn.prepareStatement("USE shop");
    final PreparedStatement ps = conn.prepareStatement("SELECT * FROM products;");
    final ResultSet rs = ps.executeQuery();
    final ResultSetMetaData rsmd = rs.getMetaData();
    final int columnCount = rsmd.getColumnCount();
    while (rs.next()) {
      for (int i = 1; i <= columnCount; ++i) {
        System.out.print(rs.getObject(i));
        System.out.print(", ");
      }

      System.out.println();
    }

    rs.close();
    ps.close();
    conn.close();
  }
}
