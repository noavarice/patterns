package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

  private static int count = 0;

  private final int id;

  private final int userId;

  private final String text;

  private final List<Comment> comments;

  public Post(int userId, String text) {
    id = ++count;
    this.userId = userId;
    this.text = text;
    comments = new ArrayList<>();
  }

  public String getText() {
    return text;
  }

  public int getUserId() {
    return userId;
  }

  public int getId() {
    return id;
  }

  public void addComment(final int userId, final String text) {
    comments.add(new Comment(id, userId, text));
  }
}
