package com.company;

import com.company.model.*;

public class Main {

  public static void main(String[] args) {
    final AbstractBlog blog = new PermissionProxy();
    try {
      blog.addPost(new Post(1, "post"));
      blog.addComment(new Comment(1, 1, "comment"));
    } catch (PermissionDeniedException e) {
      System.out.println(e.getMessage());
    }
  }
}
