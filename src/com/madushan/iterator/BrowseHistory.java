package com.madushan.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

   private List<String> urls = new ArrayList<>();

    public  String pop() {
        var lastIndex = urls.size() -1 ;
        return  urls.remove(lastIndex);
    }

    public  void push(String url) {
        urls.add(url);
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
