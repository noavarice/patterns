package com.company.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapts {@link Enumeration} to be suitable for use where {@link Iterator} is needed
 * @param <T> Enumeration item type
 */
public class EnumerationAdapter<T> implements Iterator<T> {

  private final Enumeration<T> enumeration;

  public EnumerationAdapter(final Enumeration<T> enumeration) {
    this.enumeration = enumeration;
  }

  public final Enumeration<T> getEnumeration() {
    return enumeration;
  }

  @Override
  public boolean hasNext() {
    return enumeration.hasMoreElements();
  }

  @Override
  public T next() {
    return enumeration.nextElement();
  }
}
