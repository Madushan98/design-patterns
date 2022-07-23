package com.madushan.Factory;

import com.madushan.Factory.Matcha.ViewEngine;

import java.util.Map;

public class VueViewEngine extends ViewEngine {

    public String render(String viewName, Map<String, Object> context){
        return "View rendered by Vue";
    }
}
