package com.madushan.strategy;

import com.madushan.strategy.compressor.CompressorStrategy;
import com.madushan.strategy.compressor.JpegCompressor;
import com.madushan.strategy.filter.BWFilter;
import com.madushan.strategy.filter.FilterStrategy;

public class Demo {

    public static void main(String[] args) {
        FilterStrategy bwFilter = new BWFilter();
        CompressorStrategy jpegCompressor = new JpegCompressor();
        ImageStorage imageStorage = new ImageStorage(jpegCompressor,bwFilter);
        imageStorage.store("aFile");
    }
}
