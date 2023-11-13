package com.kaitaiming.finance.service.impl;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.InvoiceItemMapper;
import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.model.InvoiceItemDO;
import com.kaitaiming.finance.po.InvoiceItemPO;
import com.kaitaiming.finance.service.InvoiceItemService;

/**
 * 发票项目服务
 *
 * @author Administrator
 */
@Component
public class InvoiceItemServiceImpl extends ServiceImpl<InvoiceItemMapper, InvoiceItemPO>
    implements InvoiceItemService {

    @Override
    public Long saveInvoiceItem(InvoiceItemDO invoice) {
        return null;
    }

    @Override
    public boolean deleteInvoiceItem(Long id) {
        return false;
    }

    @Override
    public InvoiceInfoDO queryInvoiceItem(Long id) {
        return null;
    }
}
