package com.kaitaiming.finance.controller;

import java.util.List;

import com.kaitaiming.finance.model.ApprovalProcessDO;

/**
 * 
 * 审批流程
 * 
 * @author houwei
 * @Date 2023/11/7 23:34
 * @Description
 */
public class ApprovalProcessController {

    // 模拟审批流程列表，存储创建的审批流程
    private List<ApprovalProcessDO> approvalProcesses;

    /**
     * 创建审批流程
     *
     * @param processName 审批流程名称
     * @param description 审批流程描述
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param creatorId 创建者ID
     */
    public void createApprovalProcess(String processName, String description, String startDate, String endDate,
        int creatorId) {

    }

    /**
     * 查询审批流程进度
     *
     * @param processId 审批流程ID
     * @return 审批流程的进度信息
     */
    public List<ApprovalProcessDO> getApprovalProcessProgress(int processId) {
        // 实际操作中，需要从数据库或缓存中查询审批流程进度信息
        // 返回该审批流程的进度信息
        return null;
    }

    /**
     * 审批通过
     *
     * @param expenseId 报销单ID
     * @param approverId 审批者ID
     */
    public void approveExpense(int expenseId, int approverId) {
        // 实际操作中，需要将报销单状态更新为已通过，并记录审批信息
    }

    /**
     * 审批拒绝
     *
     * @param expenseId 报销单ID
     * @param approverId 审批者ID
     */
    public void rejectExpense(int expenseId, int approverId) {
        // 实际操作中，需要将报销单状态更新为已拒绝，并记录审批信息
    }
}
