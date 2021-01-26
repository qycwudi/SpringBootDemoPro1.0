package com.qyc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Instructor;
import com.qyc.beans.BkStaff;
import com.qyc.beans.Users;
import com.qyc.beans.UserVo;
import com.qyc.cfg.JWTUtil;
import com.qyc.mapper.PasswordMapper;
import com.qyc.service.BkStaffService;
import com.util.security.JiaMi;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * <p>
 * InnoDB free: 9216 kB 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-08-25
 */
@Service
public class BkStaffServiceImpl extends ServiceImpl<PasswordMapper, BkStaff> implements BkStaffService {

    @Override
    public String login(Users user) {
        JWTUtil jwtUtil = new JWTUtil();
        UserVo userVo = getInfo(user.getUsername());
        System.out.println("userVo = " + userVo);
        if (userVo != null) {
            String Upasswd = JiaMi.jiami(user.getPassword());

            if (Upasswd.equals(userVo.getPassword())) {
                System.out.println("进入");
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("id", userVo.getID());
                hashMap.put("username", userVo.getAccount());
                if (userVo.getImgUrl() == null || userVo.getImgUrl().equals("")) {
                    hashMap.put("avatar", "");
                } else {
                    hashMap.put("avatar", userVo.getImgUrl());
                }

                hashMap.put("password", userVo.getPassword());
                    hashMap.put("roles", "admin");
                System.out.println("hashMap = " + hashMap.toString());
                String token = jwtUtil.createToken(hashMap);
                return token;
            } else {
                return "";
            }
        }
        return "";

    }

    public String getPassword(String account) {
        String passwd = "";
        if (account.length() == 11) {
            passwd = baseMapper.getins(account);
        }
        return passwd;
    }

    @Override
    public UserVo getInfo(String account) {
        String passwd = "";
        UserVo userVo = new UserVo();

        if (account.length() == 11) {
            Instructor ins = baseMapper.getIns(account);
            userVo.setID(ins.getId());
            userVo.setAccount(ins.getAccount());
            userVo.setPassword(ins.getInsPassword());
            userVo.setRole(ins.getRole());
            userVo.setImgUrl(ins.getImgUrl());
        }
        return userVo;
    }
}
