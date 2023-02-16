package com.madushan.decorator;

import com.madushan.decorator.Stream.CloudStream;
import com.madushan.decorator.Stream.CompressCloudStream;
import com.madushan.decorator.Stream.EncryptedCloudStream;
import com.madushan.decorator.Stream.Stream;

public class Demo {

    public static void main(String[] args) {
        var cloudStream = new CloudStream();
        cloudStream.write("Some data");

        Stream compressCloudStream = new CompressCloudStream(cloudStream);
        compressCloudStream.write("Some data");

        var encryptCloudStream = new EncryptedCloudStream(new CompressCloudStream(new CloudStream()));
        encryptCloudStream.write("Some data");
    }
}
