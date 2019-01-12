package com.youzhong.dao;

import com.youzhong.entity.Promodel;
import com.youzhong.entity.PromodelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromodelMapper {
    long countByExample(PromodelExample example);

    int deleteByExample(PromodelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Promodel record);

    int insertSelective(Promodel record);

    List<Promodel> selectByExample(PromodelExample example);

    Promodel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Promodel record, @Param("example") PromodelExample example);

    int updateByExample(@Param("record") Promodel record, @Param("example") PromodelExample example);

    int updateByPrimaryKeySelective(Promodel record);

    int updateByPrimaryKey(Promodel record);
}