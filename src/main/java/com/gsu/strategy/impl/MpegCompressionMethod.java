package com.gsu.strategy.impl;

import com.gsu.strategy.CompressionMethod;

public class MpegCompressionMethod implements CompressionMethod {
    @Override
    public byte[] compress(byte[] rawData) {
        System.out.println("Compressed with MPEG" + System.lineSeparator());
        return new byte[0];
    }
}
