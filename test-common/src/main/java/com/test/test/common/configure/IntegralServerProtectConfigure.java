package com.test.test.common.configure;

import com.test.test.common.interceptor.IntegralServerProtectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 微服务防护配置
 *
 * @author wangjiahao
 */
public class IntegralServerProtectConfigure implements WebMvcConfigurer {

    private HandlerInterceptor handlerInterceptor;

    @Autowired
    public void setIntegralServerProtectInterceptor(HandlerInterceptor integralServerProtectInterceptor) {
        this.handlerInterceptor = integralServerProtectInterceptor;
    }

    @Bean
    @ConditionalOnMissingBean(value = PasswordEncoder.class)
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public HandlerInterceptor integralServerProtectInterceptor() {
        return new IntegralServerProtectInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor);
    }
}
