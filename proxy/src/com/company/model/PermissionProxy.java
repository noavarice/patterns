package com.company.model;

import java.util.Collections;

public class PermissionProxy implements AbstractBlog {

  private final AbstractBlog proxied;

  private final User user;

  public PermissionProxy() {
    this.proxied = new Blog(new User(Collections.singleton(Permissions.ADD_POST)));
    this.user = proxied.getUser();
  }

  @Override
  public User getUser() {
    return user;
  }

  @Override
  public void addPost(Post post) throws PermissionDeniedException {
    if (!user.getPermissions().contains(Permissions.ADD_POST)) {
      throw new PermissionDeniedException("Cannot add post");
    }

    proxied.addPost(post);
  }

  @Override
  public void addComment(Comment comment) throws PermissionDeniedException {
    if (!user.getPermissions().contains(Permissions.ADD_COMMENT)) {
      throw new PermissionDeniedException("Cannot add comment");
    }

    proxied.addComment(comment);
  }
}
