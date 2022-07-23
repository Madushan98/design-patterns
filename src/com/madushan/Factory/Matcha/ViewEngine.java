package com.madushan.Factory.Matcha;

import java.util.Map;

public class ViewEngine {

    public String render(String viewName, Map<String, Object> context){
        return "View rendered by Matcha";
    }
}
