package com.madushan.Factory.Matcha;

import java.util.Map;

public class MatchViewEngine  extends  ViewEngine{
    public String render(String viewName, Map<String, Object> context){
        return "View rendered by Matcha";
    }
}
