package com.kaitaiming.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.po.InvoiceInfoPO;

/**
 * 发票
 * 
 * @author Administrator
 */
public interface InvoiceService extends IService<InvoiceInfoPO> {

    /**
     * 保存发票信息
     * 
     * @param invoice 发票信息
     * @return 是否保存成功
     */
    Long saveInvoice(InvoiceInfoDO invoice);

    /**
     * 删除发票信息
     * 
     * @param id 发票信息ID
     * @return 是否删除成功
     */
    boolean deleteInvoice(Long id);

    /**
     * 查询发票信息
     * 
     * @param id 发票信息ID
     * @return 发票信息
     */
    InvoiceInfoDO queryInvoice(Long id);
}
