package com.kaitaiming.finance.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaitaiming.finance.model.ExpenseAccountDO;
import com.kaitaiming.finance.po.ExpenseAccountPO;

/**
 * 打款账户
 *
 * @author Administrator
 */
public interface ExpenseAccountService extends IService<ExpenseAccountPO> {
    /**
     * 保存报销账户
     * 
     * @param expenseAccount 报销账户
     * @return 是否保存成功
     */
    Long saveExpenseAccount(ExpenseAccountDO expenseAccount);

    /**
     * 删除报销账户
     * 
     * @param id 报销账户ID
     * @return 是否删除成功
     */
    boolean deleteExpenseAccount(Long id);

    /**
     * 查询报销账户
     * 
     * @param id 报销账户ID
     * @return 报销账户
     */
    ExpenseAccountDO queryExpenseAccount(Long id);

    /**
     * 查询报销账户
     *
     * @return 报销账户
     */
    List<ExpenseAccountDO> queryExpenseAccount();
}