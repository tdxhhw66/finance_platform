package com.kaitaiming.finance.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.ExpenseAccountMapper;
import com.kaitaiming.finance.model.ExpenseAccountDO;
import com.kaitaiming.finance.po.ExpenseAccountPO;
import com.kaitaiming.finance.service.ExpenseAccountService;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.convert.Convert;

/**
 * 打款账户
 *
 * @author Administrator
 */
@Component
public class ExpenseAccountServiceImpl extends ServiceImpl<ExpenseAccountMapper, ExpenseAccountPO>
    implements ExpenseAccountService {
    @Override
    public Long saveExpenseAccount(ExpenseAccountDO expenseAccount) {

        ExpenseAccountPO expenseAccountPo = Convert.convert(ExpenseAccountPO.class, expenseAccount);
        this.save(expenseAccountPo);
        return expenseAccountPo.getId();
    }

    @Override
    public boolean deleteExpenseAccount(Long id) {
        return this.removeById(id);
    }

    @Override
    public ExpenseAccountDO queryExpenseAccount(Long id) {

        ExpenseAccountPO expenseAccountPO = this.getById(id);
        ExpenseAccountDO expenseAccountDO = Convert.convert(ExpenseAccountDO.class, expenseAccountPO);
        return expenseAccountDO;
    }

    @Override
    public List<ExpenseAccountDO> queryExpenseAccount() {
        List<ExpenseAccountPO> list = this.list();
        List<ExpenseAccountDO> expenseAccountDOS = null;
        if (CollectionUtil.isNotEmpty(list)) {
            expenseAccountDOS =
                list.stream().map(expenseAccountPo -> Convert.convert(ExpenseAccountDO.class, expenseAccountPo))
                    .collect(Collectors.toList());
        }
        return expenseAccountDOS;
    }
}
