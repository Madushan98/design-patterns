package com.madushan.Factory;

import com.madushan.Factory.Matcha.Controller;
import com.madushan.Factory.Matcha.MatchViewEngine;
import com.madushan.Factory.Matcha.ViewEngine;

public class VueController  extends Controller {

    protected ViewEngine CreateViewEngine(){
        return new VueViewEngine();
    }
}
