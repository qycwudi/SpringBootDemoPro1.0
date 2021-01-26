package com.qyc.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qyc
 * @time 2020/8/25 - 10:32
 */
@Data
public class Users implements Serializable {
    private String username;
    private String password;
}
