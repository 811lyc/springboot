package com.test.test.common.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiahao
 * @date 2020/4/1
 */
public class BaseController {

    protected Map<String, Object> getDataTable(IPage<?> pageInfo) {
        Map<String, Object> rspData = new HashMap<>();
        rspData.put("rows", pageInfo.getRecords());
        rspData.put("total", pageInfo.getTotal());
        return rspData;
    }


}
