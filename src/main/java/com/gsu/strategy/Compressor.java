package com.gsu.strategy;

public class Compressor {

    private CompressionMethod compressionMethod;

    public void setCompressionMethod(final CompressionMethod compressionMethod) {
        this.compressionMethod = compressionMethod;
    }

    public byte[] compress(final byte[] rawData) {
        return compressionMethod.compress(rawData);
    }
}
