package com.kaitaiming.finance.model.enums;

import lombok.Getter;

/**
 * 报销方式
 * 
 * @author Administrator
 */
@Getter
public enum ReimbursementMethodEnum {

    /**
     * 现金
     */
    CASH(1, "现金"),
    /**
     * 银行
     */
    BANK(2, "银行"),
    /**
     * 抵借款
     */
    LOAN_OFFSET(3, "抵借款"),
    /**
     * 冲账
     */
    OFFSET(4, "冲账");

    private int code;
    private String name;

    ReimbursementMethodEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
