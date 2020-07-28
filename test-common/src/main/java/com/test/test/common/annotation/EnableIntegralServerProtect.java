package com.test.test.common.annotation;

import com.test.test.common.configure.IntegralServerProtectConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wangjiahao
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(IntegralServerProtectConfigure.class)
public @interface EnableIntegralServerProtect {
}
