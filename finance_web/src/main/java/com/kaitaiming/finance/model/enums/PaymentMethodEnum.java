package com.kaitaiming.finance.model.enums;

import lombok.Getter;

/**
 * 付款方式
 * 
 * @author Administrator
 */
@Getter
public enum PaymentMethodEnum {

    /**
     * 线下消费
     */
    OFFLINE_CONSUMPTION(0, "线下消费"),

    /**
     * 线上消费
     */
    ONLINE_CONSUMPTION(1, "线上消费"),

    /**
     * 预算内
     */
    WITHIN_BUDGET(2, "预算内"),
    /**
     * 预算外
     */
    OUTSIDE_BUDGET(2, "预算外");

    private int code;
    private String name;

    PaymentMethodEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
