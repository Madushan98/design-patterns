package com.madushan.template;

public abstract class Task {

    private final AuditTrail auditTrail;

    Task(){
        this.auditTrail = new AuditTrail();
    }

    protected   Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void  recordAuditTrail(){
        auditTrail.recordAuditTrail();
        doExecute();
    }

    protected abstract  void  doExecute();


}
