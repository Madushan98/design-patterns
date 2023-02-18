package com.madushan.momento;

public class Demo {

    public  static  void main (String[] args) {


          var codeEditor = new CodeEditor();
          var history = new History();

          codeEditor.setText("a");
          history.pushCode(codeEditor.createCodeState());
          codeEditor.setText("b");
          history.pushCode(codeEditor.createCodeState());

          codeEditor.setText("c");
          codeEditor.restore(history.removeCode());
          codeEditor.restore(history.removeCode());
          System.out.println(codeEditor.getText());

          codeEditor.setText("c");
          codeEditor.restore(history.removeCode());
          codeEditor.restore(history.removeCode());
          System.out.println(codeEditor.getText());
    }
}
