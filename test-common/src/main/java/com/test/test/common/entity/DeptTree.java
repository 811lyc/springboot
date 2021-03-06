package com.test.test.common.entity;

import com.test.test.common.entity.system.Dept;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjiahao
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptTree extends Tree<Dept> {

    private Integer orderNum;
}
