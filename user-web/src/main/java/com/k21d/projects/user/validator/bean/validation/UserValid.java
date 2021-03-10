package com.k21d.projects.user.validator.bean.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserValidAnnotationValidator.class)
public @interface UserValid {

    String message() default "";

    long idRange() default 0L;

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}