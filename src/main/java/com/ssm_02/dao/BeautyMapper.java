package com.ssm_02.dao;


import org.apache.ibatis.annotations.Param;
import com.ssm_02.pojo.Beauty;
import com.ssm_02.pojo.BeautyExample;

import java.util.List;

public interface BeautyMapper {
    long countByExample(BeautyExample example);

    int deleteByExample(BeautyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Beauty record);

    int insertSelective(Beauty record);

    List<Beauty> selectByExampleWithBLOBs(BeautyExample example);

    List<Beauty> selectByExample(BeautyExample example);

    Beauty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Beauty record, @Param("example") BeautyExample example);

    int updateByExampleWithBLOBs(@Param("record") Beauty record, @Param("example") BeautyExample example);

    int updateByExample(@Param("record") Beauty record, @Param("example") BeautyExample example);

    int updateByPrimaryKeySelective(Beauty record);

    int updateByPrimaryKeyWithBLOBs(Beauty record);

    int updateByPrimaryKey(Beauty record);
}