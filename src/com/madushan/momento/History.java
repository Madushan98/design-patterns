package com.madushan.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<CodeState> codeStates = new ArrayList<>();

    public CodeState removeCode(){
        var index = codeStates.size() -1 ;
        return codeStates.remove(index);
    }
    public  void  pushCode(CodeState codeState){
        codeStates.add(codeState);

    }

}
