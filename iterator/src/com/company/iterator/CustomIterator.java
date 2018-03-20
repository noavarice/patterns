package com.company.iterator;

public interface CustomIterator<T> {

  boolean hasMore();

  T getNext();
}
