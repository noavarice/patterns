package com.company.model;

public interface AbstractBlog {

  User getUser();

  void addPost(final Post post) throws PermissionDeniedException;

  void addComment(final Comment comment) throws PermissionDeniedException;
}
