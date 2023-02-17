package com.madushan.statePattern;

public class Canvas {
    private Tool tool ;

    public  void mouseUp(){
        tool.mouseUp();
    }

    public Tool getTool() {
        return tool;
    }

    public  void setTool(Tool tool){
        this.tool = tool ;
    }
}
