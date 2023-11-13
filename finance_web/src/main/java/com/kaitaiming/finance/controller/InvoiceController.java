package com.kaitaiming.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaitaiming.finance.model.InvoiceInfoDO;
import com.kaitaiming.finance.service.InvoiceService;

/**
 * 发票信息接口
 */
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    /**
     * 保存发票信息
     * 
     * @param invoice 发票信息
     * @return 是否保存成功
     */
    @PostMapping("/save")
    public Long saveInvoice(@RequestBody InvoiceInfoDO invoice) {
        return invoiceService.saveInvoice(invoice);
    }

    /**
     * 删除发票信息
     * 
     * @param id 发票信息ID
     * @return 是否删除成功
     */
    @PostMapping("/delete")
    public boolean deleteInvoice(@RequestParam("id") Long id) {
        return invoiceService.deleteInvoice(id);
    }

    /**
     * 查询发票信息
     * 
     * @param id 发票信息ID
     * @return 发票信息
     */
    @GetMapping("/query")
    public InvoiceInfoDO queryInvoice(@RequestParam("id") Long id) {
        return invoiceService.queryInvoice(id);
    }
}
