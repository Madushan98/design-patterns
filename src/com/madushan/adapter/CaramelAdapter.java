package com.madushan.adapter;

import com.madushan.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements   Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }

}
