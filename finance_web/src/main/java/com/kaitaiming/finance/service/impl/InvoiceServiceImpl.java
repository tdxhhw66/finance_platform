package com.kaitaiming.finance.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.InvoiceMapper;
import com.kaitaiming.finance.model.FileDO;
import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.model.InvoiceItemDO;
import com.kaitaiming.finance.po.FilePO;
import com.kaitaiming.finance.po.InvoiceInfoPO;
import com.kaitaiming.finance.po.InvoiceItemPO;
import com.kaitaiming.finance.service.FileService;
import com.kaitaiming.finance.service.InvoiceItemService;
import com.kaitaiming.finance.service.InvoiceService;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.convert.Convert;

/**
 * 发票服务
 *
 * @author Administrator
 */
@Component
public class InvoiceServiceImpl extends ServiceImpl<InvoiceMapper, InvoiceInfoPO> implements InvoiceService {

    @Autowired
    public InvoiceItemService invoiceItemService;

    @Autowired
    public FileService fileService;

    /**
     * 保存发票信息
     *
     * @param invoiceInfoDO 发票信息
     * @return 是否保存成功
     */
    @Override
    public Long saveInvoice(InvoiceInfoDO invoiceInfoDO) {
        InvoiceInfoPO invoiceInfoPO = Convert.convert(InvoiceInfoPO.class, invoiceInfoDO);
        this.saveOrUpdate(invoiceInfoPO);
        Long invoiceId = invoiceInfoPO.getId();

        // 保存发票附件
        List<FileDO> files = invoiceInfoDO.getFiles();
        if (CollectionUtil.isNotEmpty(files)) {
            Collection<FilePO> filePOs =
                files.stream().map(item -> Convert.convert(FilePO.class, item)).collect(Collectors.toList());
            filePOs.forEach(invoiceItemPO -> invoiceItemPO.setRelatedId(invoiceId));
            fileService.saveBatch(filePOs);
        }

        // 保存发票明细
        List<InvoiceItemDO> invoiceItems = invoiceInfoDO.getInvoiceItems();
        if (CollectionUtil.isNotEmpty(invoiceItems)) {

            Collection<InvoiceItemPO> invoiceItemPOS = invoiceItems.stream()
                .map(item -> Convert.convert(InvoiceItemPO.class, item)).collect(Collectors.toList());
            invoiceItemPOS.forEach(invoiceItemPO -> invoiceItemPO.setInvoiceId(invoiceId));
            invoiceItemService.saveBatch(invoiceItemPOS);
        }

        return invoiceId;
    }

    /**
     * 删除发票信息
     *
     * @param id 发票id
     * @return 是否保存成功
     */
    @Override
    public boolean deleteInvoice(Long id) {
        boolean remove = this.removeById(id);
        return remove;
    }

    @Override
    public InvoiceInfoDO queryInvoice(Long id) {
        InvoiceInfoPO invoiceInfoPO = this.getById(id);
        return Convert.convert(InvoiceInfoDO.class, invoiceInfoPO);
    }
}
