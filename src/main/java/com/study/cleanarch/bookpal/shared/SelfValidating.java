package com.study.cleanarch.bookpal.shared;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 입력 유효성 검증을 위한 계층
 * @param <T>
 */
public abstract class SelfValidating<T> {
    private final Validator validator;


    public SelfValidating() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected void validateSelf() {
        Set<ConstraintViolation<T>> validate = validator.validate((T) this);
        if (!validate.isEmpty()) {
            throw new ConstraintViolationException(validate);
        }
    }


}