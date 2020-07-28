package com.test.test.common.entity.constant;

/**
 * @author wangjiahao
 * @date 2019/12/10
 */
public class MysqlConstant {
    /**
     * 状态 0正常，1禁用
     */
    public static final Integer STATUS_VALID = 0;
    public static final Integer STATUS_INVALID = 1;

    /**
     * 逻辑删除 0未删除 1删除
     */
    public static final Integer DELETE_EXIST = 0;
    public static final Integer DELETE_NOT_EXIST = 1;
}
