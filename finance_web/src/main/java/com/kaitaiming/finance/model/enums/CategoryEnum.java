package com.kaitaiming.finance.model.enums;

import lombok.Getter;

/**
 * 报销方式
 * 
 * @author Administrator
 */
@Getter
public enum CategoryEnum {

    /**
     * 普通
     */
    ORDINARY(1, "普通"),
    /**
     * 差旅
     */
    TRAVEL(2, "差旅"),
    /**
     * 资本性支出
     */
    CAPITAL_EXPENDITURE(3, "资本性支出");

    private int code;
    private String name;

    CategoryEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
