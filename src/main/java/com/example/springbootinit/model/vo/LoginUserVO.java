package com.example.springbootinit.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 脱敏后的用户信息
 */
@Data
public class LoginUserVO implements Serializable {
    /**
     * 用户 id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户性别
     */
    private Integer gender;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}