package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Blog implements AbstractBlog {

  private final User user;

  private final List<Post> posts;

  public Blog(final User user) {
    this.user = user;
    this.posts = new ArrayList<>();
  }

  @Override
  public User getUser() {
    return user;
  }

  @Override
  public void addPost(final Post post) {
    posts.add(post);
  }

  @Override
  public void addComment(final Comment comment) {
    posts.get(comment.getPostId()).addComment(comment.getUserId(), comment.getText());
  }
}
