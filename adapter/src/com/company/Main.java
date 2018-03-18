package com.company;

import com.company.adapter.EnumerationAdapter;

import java.util.*;
import java.util.function.Consumer;

public class Main {

  /**
   * Applies {@code f} to each item returned by {@code iter}
   */
  private static <T> void processCollection(final Iterator<T> iter, final Consumer<T> f) {
    while (iter.hasNext()) {
      f.accept(iter.next());
    }
  }

  /**
   * Example of legacy method with return type of deprecated collection
   */
  private static <T> Enumeration<T> getOldLegacyCollection(final Collection<T> coll) {
    return new Vector<>(coll).elements();
  }

  public static void main(String[] args) {
    final Consumer<Integer> printInt = System.out::println;
    final List<Integer> intList = Arrays.asList(1, 2, 3, 123412);
    processCollection(intList.iterator(), printInt);
    final Enumeration<Integer> intEnum = getOldLegacyCollection(intList);
    processCollection(new EnumerationAdapter<>(intEnum), printInt);
  }
}
