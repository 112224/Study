package Service;

import AnnotationUtils.ComnUtils;
import DTO.SomeObj;

public class SomeServiceimpl extends Exception {

    public SomeObj getData(SomeObj obj) {
        if (ComnUtils.validationCheck(obj)) {
            System.out.println("Clear!");
        } else {
            System.out.println("Fail,,");
        }
        return obj;
    }
}
