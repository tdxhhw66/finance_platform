package com.kaitaiming.finance.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 发票明细持久化对象（Persistence Object，PO）表示发票明细的各个属性。
 */
@Data
@TableName("invoice_item")
public class InvoiceItemPO {
    /**
     * 发票明细ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发票ID
     */
    private Long invoiceId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 商品型号
     */
    private String itemModel;

    /**
     * 商品单位
     */
    private String itemUnit;

    /**
     * 商品数量
     */
    private Double itemQuantity;

    /**
     * 商品单价
     */
    private Double unitPrice;

    /**
     * 商品总金额
     */
    private Double amount;

    /**
     * 税率
     */
    private Double taxRate;

    /**
     * 税额
     */
    private Double taxAmount;

    /**
     * 创建时间
     */
    private Date createTime;
}
