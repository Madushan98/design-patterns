package com.madushan;

import com.madushan.momento.CodeEditor;
import com.madushan.momento.History;
import com.madushan.statePattern.Canvas;
import com.madushan.statePattern.TextBox;
import com.madushan.statePattern.Tool;

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




    }

    private static  void drawUIControl(Tool tool){
        tool.mouseDrag();

    }

}
