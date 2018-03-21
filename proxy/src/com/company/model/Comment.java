package com.company.model;

public class Comment {

  private final int postId;

  private final int userId;

  private final String text;

  public Comment(int postId, int userId, String text) {
    this.postId = postId;
    this.userId = userId;
    this.text = text;
  }

  public int getUserId() {
    return userId;
  }

  public String getText() {
    return text;
  }

  public int getPostId() {
    return postId;
  }
}
