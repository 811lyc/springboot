package com.test.test.common.utils;

import java.util.UUID;

/**
 * @author Zone
 * @version 1.0
 * @Description
 * @date 2020/5/22 14:25
 */
public class CreatePreOrderIdUtil {

    /**
     * 时间信息8位
     * 下单时间的Unix时间戳后8位
     * 用户user id后4位
     **/
    public static String getPreOrderId() {

        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 21);
    }
}
