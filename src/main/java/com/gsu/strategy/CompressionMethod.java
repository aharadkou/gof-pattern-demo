package com.gsu.strategy;

public interface CompressionMethod {
    byte[] compress(final byte[] rawData);
}
