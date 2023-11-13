package com.kaitaiming.finance.model.enums;

import lombok.Getter;

/**
 * 审批状态
 * 
 * @author Administrator
 */
@Getter
public enum ApprovalStatusEnum {

    /**
     * 进行中
     */
    PROGRESS(0),

    /**
     * 通过
     */
    AGREE(1),

    /**
     * 拒绝
     */
    REFUSE(2);

    private int code;

    ApprovalStatusEnum(int code) {
        this.code = code;
    }
}
