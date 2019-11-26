package com.goldenhouse.dao.impl;

import com.goldenhouse.dao.ISugDao;
import com.goldenhouse.entity.Sug;
import com.goldenhouse.mapper.SugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sugDao")
public class SugDaoImpl implements ISugDao {

    @Autowired
    @Qualifier("sugMapper")
    private SugMapper sugMapper;

    /**
     * 根据意见ID删除该意见信息
     * @param sugId
     * @return
     */
    @Override
    public int deleteSug(int sugId) {
        return sugMapper.deleteSug( sugId );
    }

    /**
     * 查询所有意见信息
     * @return
     */
    @Override
    public List<Sug> queryAllSug() {
        return sugMapper.queryAllSug();
    }

    /**
     * 用户提交意见悉
     * @return
     */
    @Override
    public int cusSubmitSug(Sug sug) {
        return sugMapper.cusSubmitSug(sug);
    }

}
