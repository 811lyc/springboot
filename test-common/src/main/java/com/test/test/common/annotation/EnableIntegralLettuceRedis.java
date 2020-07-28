package com.test.test.common.annotation;

import com.test.test.common.configure.IntegralLettuceRedisConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wangjiahao
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(IntegralLettuceRedisConfigure.class)
public @interface EnableIntegralLettuceRedis {
}
