package com.k21d.projects.user.validator.bean.validation;

import com.k21d.projects.user.domain.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserValidAnnotationValidator implements ConstraintValidator<UserValid, User> {

    private long idRange;
    @Override
    public void initialize(UserValid annotation) {
        this.idRange = annotation.idRange();
    }

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        // 获取模板信息
        context.getDefaultConstraintMessageTemplate();
//        if (String.valueOf(value.getId()).length()<idRange){
//
//            return false;
//        }
        return false;
    }
}

