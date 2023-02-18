package com.madushan;

import com.madushan.Factory.ProdiuctsController;
import com.madushan.momento.CodeEditor;
import com.madushan.momento.History;
import com.madushan.observer.Chart;
import com.madushan.observer.DataSource;
import com.madushan.statePattern.Canvas;
import com.madushan.statePattern.TextBox;
import com.madushan.statePattern.Tool;
import com.madushan.template.TransferMoney;

public class Main {

    public static void main(String[] args) {







//Observer pattern

//        var observer = new DataSource();
//        var observable = new Chart();
//        observer.setValue(10);
//        observer.add(observable);
//        observer.notifyObservable();
//        System.out.println(observer.getValue());
//        System.out.println(observable.getValue());


//Factory Pattern

          var  controller = new ProdiuctsController();
          controller.listProducts();



    }

// state pattern

//    private static  void drawUIControl(Tool tool){
//        tool.mouseDrag();
//
//    }


}
