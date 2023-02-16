package com.madushan.decorator.Stream;

public class CompressCloudStream implements Stream {

    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return "Compressed " + data;
    }
}
