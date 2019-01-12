package com.youzhong.dao;

import com.youzhong.entity.Reqimg;
import com.youzhong.entity.ReqimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqimgMapper {
    long countByExample(ReqimgExample example);

    int deleteByExample(ReqimgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Reqimg record);

    int insertSelective(Reqimg record);

    List<Reqimg> selectByExampleWithBLOBs(ReqimgExample example);

    List<Reqimg> selectByExample(ReqimgExample example);

    Reqimg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Reqimg record, @Param("example") ReqimgExample example);

    int updateByExampleWithBLOBs(@Param("record") Reqimg record, @Param("example") ReqimgExample example);

    int updateByExample(@Param("record") Reqimg record, @Param("example") ReqimgExample example);

    int updateByPrimaryKeySelective(Reqimg record);

    int updateByPrimaryKeyWithBLOBs(Reqimg record);

    int updateByPrimaryKey(Reqimg record);
}