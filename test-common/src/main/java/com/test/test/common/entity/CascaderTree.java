package com.test.test.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjiahao
 * @date 2019/12/19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CascaderTree<T> {

    private String value;

    private String label;

    private List<CascaderTree<T>> children;

    private boolean hasParent = false;

    private boolean hasChildren = false;

    public void initChildren() {
        this.children = new ArrayList<>();
    }

}
