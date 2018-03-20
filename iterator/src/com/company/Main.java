package com.company;

import com.company.iterator.CustomIterator;
import com.company.iterator.impl.StreamIterator;

import java.io.IOException;
import java.io.InputStream;

public class Main {

  public static void main(String[] args) throws IOException {
    final Class clazz = Main.class;
    try (final InputStream stream = clazz.getResourceAsStream("example.txt")) {
      final CustomIterator<Byte[]> iter = new StreamIterator(stream);
      final StringBuilder sb = new StringBuilder();
      while (iter.hasMore()) {
        final Byte[] bytes = iter.getNext();
        final int count = bytes.length;
        final byte[] temp = new byte[count];
        for (int i = 0; i < count; ++i) {
          temp[i] = bytes[i];
        }

        sb.append(new String(temp));
      }

      System.out.println(sb.toString());
    }
  }
}
