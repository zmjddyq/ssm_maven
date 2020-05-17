package com.ssm_02.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm_02.dao.BeautyMapper;
import com.ssm_02.pojo.Beauty;

import java.util.List;

/**
 * @author zmj
 * @date 2020/5/14 18:48
 * @Description
 */
@Service
public class BeautyService {

    @Autowired
    private BeautyMapper beautyMapper;

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public Beauty selectByPrimaryKey(Integer id){
        return beautyMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有
     * @return
     */
    public List<Beauty> selectAll(){
        return beautyMapper.selectByExample(null);
    }
}
