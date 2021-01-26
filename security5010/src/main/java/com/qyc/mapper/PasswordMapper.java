package com.qyc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.entity.Instructor;
import com.qyc.beans.BkStaff;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qyc
 * @time 2020/11/15 - 18:50
 */
@Mapper
public interface PasswordMapper extends BaseMapper<BkStaff> {

    String getins(String account);

    Instructor getIns(String account);

}
