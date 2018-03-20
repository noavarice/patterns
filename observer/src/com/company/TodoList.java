package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class TodoList {

  private final List<String> list = new ArrayList<>();

  private final Map<CallbackType, List<Consumer<BasicCallbackParams>>> CALLBACKS = new HashMap<CallbackType, List<Consumer<BasicCallbackParams>>>() {
    {
      for (final CallbackType t : CallbackType.values()) {
        put(t, new ArrayList<>());
      }
    }
  };
  private final List<Consumer<BasicCallbackParams>> onAdded = new ArrayList<>();

  public void add(final String text) {
    if (text == null || text.isEmpty()) {
      final BasicCallbackParams params = new BasicCallbackParams(text);
      CALLBACKS.get(CallbackType.ON_ADDED_DEAL_FAILED).forEach(f -> f.accept(params));
      return;
    }

    list.add(text);
    final BasicCallbackParams params = new CallbackParamsWithId(list.size(), text);
    CALLBACKS.get(CallbackType.ON_ADDED_DEAL_SUCCEEDED).forEach(f -> f.accept(params));
  }

  public boolean subscribe(final CallbackType type, final Consumer<BasicCallbackParams> callback) {
    if (callback == null) {
      return false;
    }

    CALLBACKS.get(type).add(callback);
    return true;
  }
}
