package com.kaitaiming.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaitaiming.finance.model.ExpenseItemDO;
import com.kaitaiming.finance.po.ExpenseItemPO;

/**
 * 报销项目
 *
 * @author Administrator
 */
public interface ExpenseItemService extends IService<ExpenseItemPO> {

    /**
     * 保存报销项目
     *
     * @param expenseItem 报销项目数据
     * @return 保存成功的报销项目
     */
    Long saveExpenseItem(ExpenseItemDO expenseItem);

    /**
     * 删除报销项目
     *
     * @param expenseItemId 要删除的报销项目ID
     * @return 删除是否成功的消息
     */
    boolean deleteExpenseItem(long expenseItemId);

    /**
     * 查询报销项目
     *
     * @param expenseItemId 要查询的报销项目ID
     * @return 查询到的报销项目
     */
    ExpenseItemDO getExpenseItem(long expenseItemId);
}
