package com.kaitaiming.finance.service.impl;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaitaiming.finance.mapper.FileMapper;
import com.kaitaiming.finance.po.FilePO;
import com.kaitaiming.finance.service.FileService;

/**
 * 文件服务
 * 
 * @author Administrator
 */
@Component
public class FileServiceImpl extends ServiceImpl<FileMapper, FilePO> implements FileService {

}
