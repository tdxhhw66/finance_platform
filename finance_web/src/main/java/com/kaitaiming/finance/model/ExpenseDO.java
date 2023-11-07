package com.kaitaiming.finance.model;

import lombok.Data;

/**
 * @author houwei
 * @Date 2023/9/20 22:59
 * @Description 报销单
 */
@Data
public class ExpenseDO {
    /**
     * 报销单ID
     */
    private Long formId;

    /**
     * 报销人姓名
     */
    private String employeeName;

    /**
     * 报销金额
     */
    private Double amount;

    /**
     * 报销日期
     */
    private String expenseDate;

    /**
     * 报销单状态
     */
    private String status;

    /**
     * 报销单类型
     */
    private String type;

    /**
     * 报销描述
     */
    private String description;

    public ExpenseDO(long expenseId, String updated_expenseDO_type, double updatedAmount, String updatedDescription, String pending) {
    }
}
