//package com.test.test.common.configure;
//
//import com.google.common.net.HttpHeaders;
//import com.test.test.common.entity.constant.IntegralConstant;
//import com.test.test.common.utils.IntegralUtil;
//import feign.RequestInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.util.Base64Utils;
//
///**
// * OAuth2 Feign配置
// *
// * @author wangjiahao
// */
//public class IntegralOauth2FeignConfigure {
//
//    @Bean
//    public RequestInterceptor oauth2FeignRequestInterceptor() {
//        return requestTemplate -> {
//            // 请求头中添加 Gateway Token
//            String zuulToken = new String(Base64Utils.encode(IntegralConstant.GATEWAY_TOKEN_VALUE.getBytes()));
//            requestTemplate.header(IntegralConstant.GATEWAY_TOKEN_HEADER, zuulToken);
//            // 请求头中添加原请求头中的 Token
//            String authorizationToken = IntegralUtil.getCurrentTokenValue();
//            requestTemplate.header(HttpHeaders.AUTHORIZATION, IntegralConstant.OAUTH2_TOKEN_TYPE + authorizationToken);
//        };
//    }
//}
