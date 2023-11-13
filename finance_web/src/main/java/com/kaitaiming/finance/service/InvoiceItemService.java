package com.kaitaiming.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.model.InvoiceItemDO;
import com.kaitaiming.finance.po.InvoiceItemPO;

public interface InvoiceItemService extends IService<InvoiceItemPO> {
    /**
     * 保存发票项目信息
     * 
     * @param invoice 发票信息
     * @return 是否保存成功
     */
    Long saveInvoiceItem(InvoiceItemDO invoice);

    /**
     * 删除发票项目信息
     * 
     * @param id 发票信息ID
     * @return 是否删除成功
     */
    boolean deleteInvoiceItem(Long id);

    /**
     * 查询发票项目信息
     * 
     * @param id 发票信息ID
     * @return 发票信息
     */
    InvoiceInfoDO queryInvoiceItem(Long id);
}
