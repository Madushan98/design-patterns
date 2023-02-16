package com.madushan.decorator.Stream;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "Encrypted " + data;
    }
}

