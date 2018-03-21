package com.company.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class User {

  private static int count = 1;

  private final int id;

  private final Set<Permissions> permissions;

  public User(final Collection<Permissions> permissions) {
    id = ++count;
    this.permissions = new HashSet<>(permissions);
  }

  public Set<Permissions> getPermissions() {
    return permissions;
  }
}
