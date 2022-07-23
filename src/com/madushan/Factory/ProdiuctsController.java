package com.madushan.Factory;

import com.madushan.Factory.Matcha.Controller;
import com.madushan.Factory.Matcha.MatchViewEngine;
import com.madushan.Factory.Matcha.ViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProdiuctsController extends VueController {

    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }



}
