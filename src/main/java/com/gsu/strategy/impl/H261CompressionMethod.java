package com.gsu.strategy.impl;

import com.gsu.strategy.CompressionMethod;

public class H261CompressionMethod implements CompressionMethod {
    @Override
    public byte[] compress(byte[] rawData) {
        System.out.println("Compressed with H261" + System.lineSeparator());
        return new byte[0];
    }
}
