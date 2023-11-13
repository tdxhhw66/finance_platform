package com.kaitaiming.finance.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 报销明细持久化对象（Persistence Object，PO）表示报销明细的各个属性。
 */
@Data
@TableName("expense_item")
public class ExpenseItemPO {
    /**
     * 报销明细ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 报销单ID
     */
    private Long expenseId;

    /**
     * 预算代码
     */
    private String budgetCode;

    /**
     * 预算科目
     */
    private String budgetSubject;

    /**
     * 事项描述
     */
    private String itemDescription;

    /**
     * 预算年度
     */
    private Integer budgetYear;

    /**
     * 报销金额
     */
    private Double amount;

    /**
     * 盈利体系
     */
    private String profitSystem;

    /**
     * 创建时间
     */
    private Date createTime;
}
