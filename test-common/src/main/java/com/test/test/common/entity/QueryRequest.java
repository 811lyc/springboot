package com.test.test.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author wangjiahao
 */
@Data
@ApiModel(value = "分页查询", description = "分页查询 ")
@ToString
public class QueryRequest implements Serializable {

    private static final long serialVersionUID = -486959474385813L;
    /**
     * 当前页面数据量
     */
    @ApiParam(name = "pageSize", value = "当前页面数据量", defaultValue = "10")
    private int pageSize = 10;
    /**
     * 当前页码
     */
    @ApiParam(name = "pageNum", value = "当前页码", defaultValue = "1")
    private int pageNum = 1;
    /**
     * 排序字段
     */
    @ApiParam(name = "field", value = "排序字段")
    private String field;
    /**
     * 排序规则，asc升序，desc降序
     */
    @ApiParam(name = "field", value = "排序规则，asc升序，desc降序")
    private String order;
}
