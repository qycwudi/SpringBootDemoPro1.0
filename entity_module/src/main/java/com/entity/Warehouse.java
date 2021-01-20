package com.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 仓库表
 * </p>
 *
 * @author qiangyuecheng
 * @since 2021-01-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private Long gkId;

    private String gkName;

    private Long proUserId;

    private Integer whSum;

    private Integer whNowSum;

    private String itemSize;

    private String units;

    private Double price;

    private Double whSumMoney;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private String whBzMessage;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    private Long createUser;

    private Long updateUser;


}
