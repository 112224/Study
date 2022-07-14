package DTO;


import Annotation.NotRequired;
import Annotation.Validation;

public class SomeObj {
    @Validation
    String req;
    @NotRequired
    String notReq;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getNotReq() {
        return notReq;
    }

    public void setNotReq(String notReq) {
        this.notReq = notReq;
    }
}
