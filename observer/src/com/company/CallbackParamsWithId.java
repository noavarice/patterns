package com.company;

public class CallbackParamsWithId extends BasicCallbackParams {

  private final int id;

  public CallbackParamsWithId(final int id, final String text) {
    super(text);
    this.id = id;
  }

  public int getId() {
    return id;
  }
}
