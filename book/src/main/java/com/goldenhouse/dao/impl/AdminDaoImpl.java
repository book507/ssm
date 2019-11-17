package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.IAdminDao;
import com.goldenhouse.entity.Admin;
import com.goldenhouse.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("adminDao")
public class AdminDaoImpl implements IAdminDao {
    @Autowired
    @Qualifier("adminMapper")
    private AdminMapper adminMapper;

    //管理员登录，根据查询账号名和密码，登录管理员后台
    @Override
    public Admin loginAdmin(Admin admin) {
        return adminMapper.loginAdmin( admin );
    }
}
