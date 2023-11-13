package com.kaitaiming.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.ExpenseItemMapper;
import com.kaitaiming.finance.model.ExpenseItemDO;
import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.po.ExpenseItemPO;
import com.kaitaiming.finance.service.ExpenseItemService;
import com.kaitaiming.finance.service.InvoiceService;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.convert.Convert;

/**
 * 报销项目
 * 
 * @author Administrator
 */
@Component
public class ExpenseItemServiceImpl extends ServiceImpl<ExpenseItemMapper, ExpenseItemPO>
    implements ExpenseItemService {

    @Autowired
    InvoiceService invoiceService;

    @Override
    public Long saveExpenseItem(ExpenseItemDO expenseItem) {

        // 保存发票信息
        List<InvoiceInfoDO> invoiceInfos = expenseItem.getInvoiceInfos();
        if (CollectionUtil.isNotEmpty(invoiceInfos)) {
            for (InvoiceInfoDO invoiceInfo : invoiceInfos) {
                invoiceService.saveInvoice(invoiceInfo);
            }
        }
        // 保存报销项目
        ExpenseItemPO expenseItemPo = Convert.convert(ExpenseItemPO.class, expenseItem);
        this.save(expenseItemPo);
        return expenseItemPo.getId();
    }

    @Override
    public boolean deleteExpenseItem(long expenseItemId) {
        // 返回删除是否成功的消息
        return this.removeById(expenseItemId);
    }

    @Override
    public ExpenseItemDO getExpenseItem(long expenseItemId) {
        // 根据 expenseItemId 查询对应的报销项目信息并返回
        ExpenseItemPO expenseItemPo = this.getById(expenseItemId);
        return Convert.convert(ExpenseItemDO.class, expenseItemPo);
    }
}
