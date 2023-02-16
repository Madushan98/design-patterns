package com.madushan.strategy;

import com.madushan.strategy.compressor.CompressorStrategy;
import com.madushan.strategy.filter.FilterStrategy;

public class ImageStorage {

        public  ImageStorage(CompressorStrategy compressor, FilterStrategy filter) {
            this.compressor = compressor;
            this.filter = filter;
        }

        private CompressorStrategy compressor;
        private FilterStrategy filter;

        public void store(String fileName) {
            compressor.compress(fileName);
            filter.apply(fileName);
        }

        public void setCompressor(CompressorStrategy compressor) {
            this.compressor = compressor;
        }

        public void setFilter(FilterStrategy filter) {
            this.filter = filter;
        }

}
