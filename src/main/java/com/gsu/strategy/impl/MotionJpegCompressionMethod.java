package com.gsu.strategy.impl;

import com.gsu.strategy.CompressionMethod;

public class MotionJpegCompressionMethod implements CompressionMethod {
    @Override
    public byte[] compress(byte[] rawData) {
        System.out.println("Compressed with Motion-JPEG" + System.lineSeparator());
        return new byte[0];
    }
}
