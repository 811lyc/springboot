package com.test.test.common.annotation;

import com.test.test.common.selector.IntegralCloudApplicationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wangjiahao
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(IntegralCloudApplicationSelector.class)
public @interface IntegralCloudApplication {
}
