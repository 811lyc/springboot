package com.test.test.common.exception;

/**
 * 验证码类型异常
 *
 * @author wangjiahao
 */
public class ValidateCodeException extends Exception {

    private static final long serialVersionUID = 7514854456967620043L;

    public ValidateCodeException(String message) {
        super(message);
    }
}
