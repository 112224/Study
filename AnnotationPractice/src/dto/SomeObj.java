package dto;


import annotation.NotRequired;
import annotation.Validation;

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
