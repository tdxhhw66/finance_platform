package com.kaitaiming.finance.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 发票信息持久化对象（Persistence Object，PO）表示发票信息的各个属性。
 */
@Data
@TableName("invoice_info")
public class InvoiceInfoPO {
    /**
     * 发票信息ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 报销项目ID
     */
    private Long expenseItemId;

    /**
     * 发票代码
     */
    private String invoiceCode;

    /**
     * 发票号码
     */
    private String invoiceNumber;

    /**
     * 开票日期
     */
    private Date invoiceDate;

    /**
     * 发票小计金额
     */
    private Double subtotalAmount;

    /**
     * 发票小计税额
     */
    private Double subtotalTax;

    /**
     * 发票总金额
     */
    private Double totalAmount;

    /**
     * 购买方名称
     */
    private String buyerName;

    /**
     * 购买方纳税人识别号
     */
    private String buyerTaxId;

    /**
     * 购买方地址电话
     */
    private String buyerAddressPhone;

    /**
     * 购买方开户行及账号
     */
    private String buyerBankInfo;

    /**
     * 销售方名称
     */
    private String sellerName;

    /**
     * 销售方纳税人识别号
     */
    private String sellerTaxId;

    /**
     * 销售方地址电话
     */
    private String sellerAddressPhone;

    /**
     * 销售方开户行及账号
     */
    private String sellerBankInfo;

    /**
     * 创建时间
     */
    private Date createTime;
}
