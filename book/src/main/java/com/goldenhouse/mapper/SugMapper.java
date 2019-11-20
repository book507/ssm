package com.goldenhouse.mapper;

import com.goldenhouse.entity.Sug;

import java.util.List;

public interface SugMapper {

    /**
     * 根据意见ID删除该意见信息
     * @param sugId
     * @return
     */
    int deleteSug(int sugId);

    /**
     * 查询所有意见信息
     * @return
     */
    List<Sug> queryAllSug();

}
