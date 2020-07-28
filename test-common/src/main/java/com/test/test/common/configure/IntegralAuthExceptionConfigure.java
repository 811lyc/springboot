package com.test.test.common.configure;

import com.test.test.common.handler.IntegralAccessDeniedHandler;
import com.test.test.common.handler.IntegralAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * 异常翻译配置
 *
 * @author wangjiahao
 */
public class IntegralAuthExceptionConfigure {

    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public IntegralAccessDeniedHandler accessDeniedHandler() {
        return new IntegralAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public IntegralAuthExceptionEntryPoint authenticationEntryPoint() {
        return new IntegralAuthExceptionEntryPoint();
    }
}
