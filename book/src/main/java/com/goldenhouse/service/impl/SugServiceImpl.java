package com.goldenhouse.service.impl;

import com.goldenhouse.dao.ISugDao;
import com.goldenhouse.entity.Sug;
import com.goldenhouse.service.ISugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sugService")
public class SugServiceImpl implements ISugService {

    @Autowired
    @Qualifier("sugDao")
    private ISugDao iSugDao ;

    /**
     * 根据意见ID删除该意见信息
     * @param sugId
     * @return
     */
    @Override
    public int deleteSug(int sugId) {
        return iSugDao.deleteSug( sugId );
    }

    /**
     * 查询所有意见信息
     * @return
     */
    @Override
    public List<Sug> queryAllSug() {
        return iSugDao.queryAllSug();
    }

    /**
     * 用户提交意见
     * @return
     */
    @Override
    public int cusSubmitSug(Sug sug) {
        return iSugDao.cusSubmitSug(sug);
    }

}
