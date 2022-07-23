package com.madushan.Factory.Matcha;

import java.util.Map;

public class Controller {

    public void render(String viewName, Map<String, Object> context) {
        var engine = CreateViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine CreateViewEngine(){
        return new MatchViewEngine();
    }

}
