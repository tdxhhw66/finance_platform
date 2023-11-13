package com.kaitaiming.finance.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 员工银行账户持久化对象（Persistence Object，PO）表示员工银行账户的各个属性。
 */
@Data
@TableName("expense_account")
public class ExpenseAccountPO {
    /**
     * 员工银行账户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 银行账户名称
     */
    private String accountName;

    /**
     * 开户银行名称
     */
    private String bankName;

    /**
     * 银行账号
     */
    private String bankAccountNumber;

    /**
     * 备注
     */
    private String comments;

    /**
     * 创建时间
     */
    private Date createTime;
}
