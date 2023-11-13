package com.kaitaiming.finance.model;

import java.util.Date;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class FileDO {
    /**
     * 附件ID
     */
    private Long id;

    /**
     * 附件文件名
     */
    private String fileName;

    /**
     * 附件文件大小（字节）
     */
    private Long fileSize;

    /**
     * 附件上传日期
     */
    private Date createDate;

    /**
     * 关联ID
     */
    private Long relatedId;

    /**
     * 附件地址
     */
    private String fileUrl;

    /**
     * 附件类型
     */
    private String fileType;
}
