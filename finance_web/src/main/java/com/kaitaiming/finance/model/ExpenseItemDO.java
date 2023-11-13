package com.kaitaiming.finance.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 报销科目
 */
@Data
public class ExpenseItemDO {
    /**
     * 报销明细ID
     */
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

    /**
     * 报销项目附件文件地址
     */
    private List<String> fileUrls;

    /**
     * 发票信息
     */
    private List<InvoiceInfoDO> invoiceInfos;
}
