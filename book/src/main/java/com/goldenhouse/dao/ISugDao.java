package com.goldenhouse.dao;

import com.goldenhouse.entity.Sug;

import java.util.List;

public interface ISugDao {
    /**
     * 根据意见ID删除该意见信息悉
     * @param sugId
     * @return
     */
    int deleteSug(int sugId);

    /**
     * 查询所有意见信息
     * @return
     */
    List<Sug> queryAllSug();

    /**
     * 用户提交意见
     * @return
     */
    int cusSubmitSug(Sug sug);

}
