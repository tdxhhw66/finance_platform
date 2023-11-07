package com.kaitaiming.finance.model;

import lombok.Data;

/**
 * 审批流程
 * 
 * @author houwei
 * @Date 2023/11/7 23:39
 * @Description
 */
@Data
public class ApprovalProcessDO {
    /**
     * 审批流程ID
     */
    private Integer processId;

    /**
     * 审批流程名称
     */
    private String processName;

    /**
     * 审批流程描述
     */
    private String description;

    /**
     * 审批流程开始日期
     */
    private String startDate;

    /**
     * 审批流程结束日期
     */
    private String endDate;

    /**
     * 审批流程创建者ID
     */
    private Integer creatorId;
}
