package com.kaitaiming.finance.model;

import java.util.Date;
import java.util.List;

import com.kaitaiming.finance.model.enums.ApprovalStatusEnum;

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
    private Long id;

    /**
     * 报销人ID
     */
    private Long employeeId;

    /**
     * 报销人姓名
     */
    private String employeeName;

    /**
     * 报销类别
     */
    private Long category;

    /**
     * 付款方式
     */
    private Long paymentMethod;

    /**
     * 报销方式
     */
    private Long reimbursementMethod;

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
    private Integer status;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 报销日期
     */
    private Date expenseDate;

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

    /**
     * 报销单附件文件地址
     */
    private List<String> fileUrls;

    /**
     * 报销明细
     */
    private List<ExpenseItemDO> expenseItemList;

    /**
     * 打款账户
     */
    private ExpenseAccountDO expenseAccount;

    /**
     * 创建报销单
     */
    public void create() {

        this.expenseDate = new Date();
    }

    /**
     * 提交报销单
     */
    public void submit() {

        this.applyDate = new Date();
        this.status = ApprovalStatusEnum.PROGRESS.getCode();
    }

    /**
     * 通过报销单
     */
    public void agree() {

        this.approvalDate = new Date();
        this.status = ApprovalStatusEnum.AGREE.getCode();
    }

    /**
     * 退回报销单
     */
    public void refuse() {

        this.approvalDate = new Date();
        this.status = ApprovalStatusEnum.REFUSE.getCode();
    }

}
