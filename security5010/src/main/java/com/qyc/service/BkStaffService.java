package com.qyc.service;
import com.qyc.beans.UserVo;
import com.qyc.beans.BkStaff;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-08-25
 */
public interface BkStaffService extends IService<BkStaff> {

    String login(com.qyc.beans.Users per);

    String getPassword(String account);

    UserVo getInfo(String account);
}
