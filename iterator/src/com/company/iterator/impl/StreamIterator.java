package com.company.iterator.impl;

import com.company.iterator.CustomIterator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class StreamIterator implements CustomIterator<Byte[]> {

  private static final int BUFFER_SIZE = 10;

  private final InputStream stream;

  private byte[] buffer = new byte[BUFFER_SIZE];

  private boolean hasMore;

  public StreamIterator(InputStream stream) throws IOException {
    this.stream = stream;
    hasMore = stream.read(buffer) != -1;
  }

  @Override
  public boolean hasMore() {
    return hasMore;
  }

  @Override
  public Byte[] getNext() {
    final byte[] old = Arrays.copyOf(buffer, buffer.length);
    try {
      hasMore = stream.read(buffer) != -1;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }

    final Byte[] result = new Byte[BUFFER_SIZE];
    for (int i = 0; i < old.length; ++i) {
      result[i] = old[i];
    }

    return result;
  }
}
