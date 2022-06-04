package com.madushan.momento;

public class CodeEditor {
    private String text ;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public CodeState createCodeState(){
         return  new CodeState(this.text);
    }

    public void  restore(CodeState codeState){

        text = codeState.getContent() ;
    }
}
