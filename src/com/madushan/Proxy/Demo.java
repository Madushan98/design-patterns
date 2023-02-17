package com.madushan.Proxy;

public class Demo {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (String fileName : fileNames) {
            library.add(new EbookProxy(fileName));
        }

          library.openEbook("a");

    }
}
