package com.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiangyuecheng
 * @since 2021-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 操作人ID
     */
    private Long userId;

    /**
     * 操作人名称
     */
    private String userName;

    /**
     * 操作人角色
     */
    private String userRole;

    /**
     * 操作类型
     */
    private String operationType;

    /**
     * 操作名称
     */
    private String operationName;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String httpMethod;

    /**
     * 请求IP
     */
    private String ip;

    /**
     * 请求方法名
     */
    private String classMethod;

    /**
     * 请求参数
     */
    private String args;

    /**
     * 使用时间（start-end）
     */
    private Long userTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    private String ret;


}
