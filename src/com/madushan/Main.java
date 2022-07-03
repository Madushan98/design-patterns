package com.madushan;

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

        // state pattern
//        var canvas = new Canvas();
//        canvas.setTool(new TextBox());
//        canvas.mousUp();


        //momento pattern

//          var codeEditor = new CodeEditor();
//          var history = new History();

//          codeEditor.setText("a");
//          history.pushCode(codeEditor.createCodeState());
//          codeEditor.setText("b");
//          history.pushCode(codeEditor.createCodeState());
//
//          codeEditor.setText("c");
//          codeEditor.restore(history.removeCode());
//          codeEditor.restore(history.removeCode());
//          System.out.println(codeEditor.getText());

//                  codeEditor.setText("c");
//          codeEditor.restore(history.removeCode());
//          codeEditor.restore(history.removeCode());
//          System.out.println(codeEditor.getText());



        // template pattern

//         var task = new TransferMoney();
//         task.record();


        // Observer pattern

//        var observer = new DataSource();
//        var observable = new Chart();
//        observer.setValue(10);
//        observer.add(observable);
//        observer.notifyObservable();
//        System.out.println(observer.getValue());
//        System.out.println(observable.getValue());


    }

    // state pattern

//    private static  void drawUIControl(Tool tool){
//        tool.mouseDrag();
//
//    }




}
