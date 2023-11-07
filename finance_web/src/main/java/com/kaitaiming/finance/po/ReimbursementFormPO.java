package com.kaitaiming.finance.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author houwei
 * @Date 2023/9/20 22:59
 * @Description 报销单
 */
@TableName("person")
@Data
public class ReimbursementFormPO implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private String sex;

    private String remark;
}
