package com.kaitaiming.finance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.ExpenseMapper;
import com.kaitaiming.finance.model.ExpenseDO;
import com.kaitaiming.finance.po.ExpensePO;
import com.kaitaiming.finance.service.ExpenseService;

import cn.hutool.core.convert.Convert;

/**
 * 报销单服务
 * 
 * @author Administrator
 */
@Component
public class ExpenseServiceImpl extends ServiceImpl<ExpenseMapper, ExpensePO> implements ExpenseService {

    /**
     * 保存报销单
     *
     * @param expenseDO 报销单信息
     * @return 新创建的报销单ID
     */
    @Override
    public long saveExpense(ExpenseDO expenseDO) {
        // 实际操作中，创建报销单并返回新的报销单ID
        ExpensePO convert = Convert.convert(ExpensePO.class, expenseDO);
        this.saveOrUpdate(convert);
        return convert.getId();
    }

    /**
     * 提交报销单
     *
     * @param expenseId 报销单ID
     */
    @Override
    public void submitExpense(long expenseId) {
        // 实际操作中，提交指定ID的报销单
    }

    /**
     * 查询报销单
     *
     * @param expenseId 报销单ID
     * @return 报销单信息
     */
    @Override
    public ExpenseDO getExpense(long expenseId) {
        // 实际操作中，根据ID查询报销单信息
        return null;
    }

    /**
     * 审批报销单
     *
     * @param expenseId 报销单ID
     * @return 更新后的报销单信息
     */
    @Override
    public ExpenseDO approveExpense(long expenseId) {
        // 实际操作中，将指定ID的报销单标记为已审批
        return null;
    }

    /**
     * 撤回报销单
     *
     * @param expenseId 报销单ID
     */
    @Override
    public void withdrawExpense(long expenseId) {
        // 实际操作中，将指定ID的报销单撤回
    }

    /**
     * 报销单状态查询
     *
     * @param status 报销单状态
     * @return 符合状态条件的报销单列表
     */
    @Override
    public List<ExpenseDO> getExpensesByStatus(String status) {
        // 实际操作中，根据状态查询报销单列表
        return new ArrayList<>();
    }
}
