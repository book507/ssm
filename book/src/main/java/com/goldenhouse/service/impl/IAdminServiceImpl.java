package com.goldenhouse.service.impl;

import com.goldenhouse.dao.IAdminDao;
import com.goldenhouse.entity.Admin;
import com.goldenhouse.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
public class IAdminServiceImpl implements IAdminService {
    @Autowired
    @Qualifier("adminDao")
    private IAdminDao IAdminDao;

    //管理员登录，根据查询账号名和密码，登录管理员后台
    @Transactional(propagation = Propagation.REQUIRED,readOnly=true)
    @Override
    public int queryAdmin(Admin admin) {
        return IAdminDao.queryAdmin(admin);
    }
}
