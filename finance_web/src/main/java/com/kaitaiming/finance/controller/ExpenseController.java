package com.kaitaiming.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaitaiming.finance.model.ExpenseDO;
import com.kaitaiming.finance.service.ExpenseService;

@RestController
@RequestMapping("/expense") // 设置基础路径
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    /**
     * 创建报销单
     *
     * @param expenseName 报销单名称
     * @param amount 报销金额
     * @return 新创建的报销单信息
     */
    @PostMapping("/create")
    public Long createExpense(@RequestParam("expenseName") String expenseName, @RequestParam("amount") double amount) {
        // 实际操作中，创建报销单并返回新的报销单信息
        return expenseService.createExpense(null);
    }

    /**
     * 编辑报销单
     *
     * @param expenseId 报销单ID
     * @param updatedExpenseName 更新后的报销单名称
     * @return 更新后的报销单信息
     */
    @PostMapping("/edit")
    public ExpenseDO editExpense(@RequestParam("expenseId") int expenseId,
        @RequestParam("updatedExpenseName") String updatedExpenseName) {
        // 实际操作中，编辑指定ID的报销单并返回更新后的报销单信息
        return expenseService.editExpense(expenseId, updatedExpenseName);
    }

    /**
     * 提交报销单
     *
     * @param expenseId 报销单ID
     */
    @PostMapping("/submit")
    public void submitExpense(@RequestParam("expenseId") int expenseId) {
        // 实际操作中，提交指定ID的报销单
        expenseService.submitExpense(expenseId);
    }

    /**
     * 查询报销单
     *
     * @param expenseId 报销单ID
     * @return 报销单信息
     */
    @GetMapping("/get")
    public ExpenseDO getExpense(@RequestParam("expenseId") int expenseId) {
        // 实际操作中，根据ID查询报销单信息
        return expenseService.getExpense(expenseId);
    }

    /**
     * 审批报销单
     *
     * @param expenseId 报销单ID
     * @return 更新后的报销单信息
     */
    @PostMapping("/approve")
    public ExpenseDO approveExpense(@RequestParam("expenseId") int expenseId) {
        // 实际操作中，将指定ID的报销单标记为已审批
        return expenseService.approveExpense(expenseId);
    }

    /**
     * 撤回报销单
     *
     * @param expenseId 报销单ID
     */
    @PostMapping("/withdraw")
    public void withdrawExpense(@RequestParam("expenseId") int expenseId) {
        // 实际操作中，将指定ID的报销单撤回
        expenseService.withdrawExpense(expenseId);
    }

    /**
     * 报销单状态查询
     *
     * @param status 报销单状态
     * @return 符合状态条件的报销单列表
     */
    @GetMapping("/status")
    public List<ExpenseDO> getExpensesByStatus(@RequestParam("status") String status) {
        // 实际操作中，根据状态查询报销单列表
        return expenseService.getExpensesByStatus(status);
    }
}