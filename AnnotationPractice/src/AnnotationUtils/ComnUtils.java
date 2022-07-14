package AnnotationUtils;

import Annotation.Validation;

import java.lang.reflect.Field;

public class ComnUtils extends Exception{


    public static boolean validationCheck(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean result = true;

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            Validation ann = field.getAnnotation(Validation.class);
            if (ann != null) {
                field.setAccessible(true);
                String value = null;
                try {
                    value = (String)field.get(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value == null || value.trim().length() == 0) {
                    result = false;
                    break;
                }
//                System.out.println("value = " + value);
            }
        }
        return result;

    }
}
