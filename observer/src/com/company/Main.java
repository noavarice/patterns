package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    final TodoList list = new TodoList();
    list.add(null);
    list.subscribe(CallbackType.ON_ADDED_DEAL_FAILED, p -> {
      System.out.println("Failed to add deal: \"" + p.getText() + '\"');
    });
    list.add(null);

    list.add("first");
    list.subscribe(CallbackType.ON_ADDED_DEAL_SUCCEEDED, p -> {
      final CallbackParamsWithId params = (CallbackParamsWithId)p;
      System.out.println("Added deal №" + params.getId() + ": \"" + params.getText() + '\"');
    });

    list.add("secong");
    final List<String> added = new ArrayList<>();
    list.subscribe(CallbackType.ON_ADDED_DEAL_SUCCEEDED, p -> added.add(p.getText()));
    list.add("third");
    System.out.println("Added deals since subscribed: " + added.size());
  }
}
