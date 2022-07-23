package AnnotationUtils;

import Annotation.Validation;

import java.lang.reflect.Field;

public class ComnUtils extends Exception{


    public static String validationCheck(Object obj) {
        if (obj == null) {
            return "Object is Null";
        }
        String result = "OK";

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            Validation ann = field.getAnnotation(Validation.class);
            if (ann != null) {
                field.setAccessible(true);
                String value = null;
                String annoVal = null;
                try {
                    value = (String) field.get(obj);
                    annoVal = ann.value();
                    if ("NotBlank".equals(annoVal)) {
                        if (value == null || value.trim().length() == 0) {
                            result = field.getName() + " is null or blank";
                            throw new RuntimeException(result);
                        }
                    }
//                  else ... 가능
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

//                System.out.println("value = " + value);
            }
        }
        return result;

    }
}
