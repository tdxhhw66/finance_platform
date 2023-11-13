package com.kaitaiming.finance.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 报销单持久化对象（Persistence Object，PO）表示报销单的各个属性。
 */
@Data
@TableName("financial_expense")
public class ExpensePO {
    /**
     * 报销单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 报销日期
     */
    private Date expenseDate;

    /**
     * 报销类别ID
     */
    private Long categoryId;

    /**
     * 付款方式ID
     */
    private Long paymentMethodId;

    /**
     * 报销方式ID
     */
    private Long reimbursementMethodId;

    /**
     * 部门代码
     */
    private String departmentCode;

    /**
     * 报销描述
     */
    private String description;

    /**
     * 报销金额
     */
    private Double amount;

    /**
     * 报销单状态
     */
    private String status;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 申请日期
     */
    private Date applyDate;

    /**
     * 审批日期
     */
    private Date approvalDate;

    /**
     * 付款日期
     */
    private Date paymentDate;
}
