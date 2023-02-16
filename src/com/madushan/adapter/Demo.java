package com.madushan.adapter;

import com.madushan.adapter.avaFilters.Caramel;

public class Demo {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }

}
