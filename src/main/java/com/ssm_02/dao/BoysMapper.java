package com.ssm_02.dao;


import org.apache.ibatis.annotations.Param;
import com.ssm_02.pojo.Boys;
import com.ssm_02.pojo.BoysExample;

import java.util.List;

public interface BoysMapper {
    long countByExample(BoysExample example);

    int deleteByExample(BoysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Boys record);

    int insertSelective(Boys record);

    List<Boys> selectByExample(BoysExample example);

    Boys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Boys record, @Param("example") BoysExample example);

    int updateByExample(@Param("record") Boys record, @Param("example") BoysExample example);

    int updateByPrimaryKeySelective(Boys record);

    int updateByPrimaryKey(Boys record);
}