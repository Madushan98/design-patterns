package com.madushan.strategy.compressor;

public class JpegCompressor implements CompressorStrategy {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}

