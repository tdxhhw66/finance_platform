package com.kaitaiming.finance.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaitaiming.finance.po.InvoiceItemPO;

/**
 * @author houwei
 * @Date 2023/9/20 23:02
 * @Description
 */
@Mapper
public interface InvoiceItemMapper extends BaseMapper<InvoiceItemPO> {

}
