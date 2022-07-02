package com.madushan.template;

public abstract class Task {

    private final AuditTrail auditTrail;

    Task(){
        this.auditTrail = new AuditTrail();
    }

    public  Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void  record(){
        auditTrail.record();
     doExecute();
    }

    protected abstract  void  doExecute();


}
