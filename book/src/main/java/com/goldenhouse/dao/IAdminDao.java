package com.goldenhouse.dao;

import com.goldenhouse.entity.Admin;

public interface IAdminDao {
    /**
     * 管理员登录，根据查询账号名和密码，登录管理员后台
     * @param admin
     * @return
     */
    int queryAdmin(Admin admin);
}
