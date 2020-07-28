package com.test.test.common.interceptor;

import com.test.test.common.entity.IntegralResponse;
import com.test.test.common.entity.constant.IntegralConstant;
import com.test.test.common.utils.IntegralUtil;
import org.apache.commons.lang3.StringUtils;

import org.springframework.http.MediaType;
import org.springframework.util.Base64Utils;
import org.springframework.web.servlet.HandlerInterceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangjiahao
 */
public class IntegralServerProtectInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        // 从请求头中获取 Gateway Token
        String token = request.getHeader(IntegralConstant.GATEWAY_TOKEN_HEADER);
        String zuulToken = new String(Base64Utils.encode(IntegralConstant.GATEWAY_TOKEN_VALUE.getBytes()));
        // 校验 Gateway Token的正确性
        if (StringUtils.equals(zuulToken, token)) {
            return true;
        } else {
            IntegralResponse integralResponse = new IntegralResponse();
            IntegralUtil.makeResponse(response, MediaType.APPLICATION_JSON_VALUE,
                    HttpServletResponse.SC_FORBIDDEN, integralResponse.message("请通过网关获取资源"));
            return false;
        }
    }
}
