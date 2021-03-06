package com.youzhong.dao;

import com.youzhong.entity.Require;
import com.youzhong.entity.RequireExample;
import com.youzhong.utils.RequireUserVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RequireMapper {
    long countByExample(RequireExample example);

    int deleteByExample(RequireExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Require record);

    int insertSelective(Require record);

    List<Require> selectByExample(RequireExample example);

    Require selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByExample(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByPrimaryKeySelective(Require record);

    int updateByPrimaryKey(Require record);
    
    
    List<RequireUserVo> findByPage();
    
    
    String findByPageId(Long id);
    
    String findByPageId2(Long id);
    
     List<Map> getColComments();
     
     List<Map> getDatas();
}