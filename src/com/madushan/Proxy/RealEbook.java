package com.madushan.Proxy;

public class RealEbook implements  Ebook{
    public String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading Ebook" + fileName);
    }

    public void show(){
        System.out.println("Showing the ebook" + fileName);
    }

    public String getFileName(){
        return fileName;
    }
}
