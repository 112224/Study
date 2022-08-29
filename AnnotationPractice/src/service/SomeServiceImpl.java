package service;

import annotationUtils.ComnUtils;
import dto.SomeObj;

public class SomeServiceImpl extends Exception {

    public SomeObj getData(SomeObj obj) {
        try {
            String msg = ComnUtils.validationCheck(obj);
            if (!msg.equals("OK")) {
                System.out.println("msg = " + msg);
                throw new IllegalArgumentException("SomeServiceImpl");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
