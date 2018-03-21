package com.company.model;

public class PermissionDeniedException extends Exception {

  public PermissionDeniedException(final String text) {
    super(text);
  }
}
