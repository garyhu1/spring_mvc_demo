package com.garyhu.validator;

import com.garyhu.pojo.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author: garyhu
 * @Since: 2017/11/20 0020.
 * @Decription:
 */
public class StudentValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Student.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","required.name","Field name is required");
    }
}
