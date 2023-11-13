package com.kaitaiming.finance.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaitaiming.finance.model.ExpenseDO;
import com.kaitaiming.finance.po.ExpensePO;

public interface ExpenseService extends IService<ExpensePO> {

    /**
     * 保存报销单
     *
     * @param expenseDO 报销单信息
     * @return 新创建的报销单ID
     */
    long saveExpense(ExpenseDO expenseDO);

    /**
     * 提交报销单
     *
     * @param expenseId 报销单ID
     */
    void submitExpense(long expenseId);

    /**
     * 查询报销单
     *
     * @param expenseId 报销单ID
     * @return 报销单信息
     */
    ExpenseDO getExpense(long expenseId);

    /**
     * 审批报销单
     *
     * @param expenseId 报销单ID
     * @return 更新后的报销单信息
     */
    ExpenseDO approveExpense(long expenseId);

    /**
     * 撤回报销单
     *
     * @param expenseId 报销单ID
     */
    void withdrawExpense(long expenseId);

    /**
     * 报销单状态查询
     *
     * @param status 报销单状态
     * @return 符合状态条件的报销单列表
     */
    List<ExpenseDO> getExpensesByStatus(String status);
}
