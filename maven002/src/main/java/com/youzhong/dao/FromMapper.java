package com.youzhong.dao;

import com.youzhong.entity.From;
import com.youzhong.entity.FromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FromMapper {
    long countByExample(FromExample example);

    int deleteByExample(FromExample example);

    int deleteByPrimaryKey(Long id);

    int insert(From record);

    int insertSelective(From record);

    List<From> selectByExample(FromExample example);

    From selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") From record, @Param("example") FromExample example);

    int updateByExample(@Param("record") From record, @Param("example") FromExample example);

    int updateByPrimaryKeySelective(From record);

    int updateByPrimaryKey(From record);
}