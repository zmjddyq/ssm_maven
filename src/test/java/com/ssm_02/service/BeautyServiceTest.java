package com.ssm_02.service;

import com.ssm_02.pojo.Beauty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zmj
 * @date 2020/5/15 20:03
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BeautyServiceTest {

    @Autowired
    private BeautyService beautyService;

    @Test
    public void test(){
        List<Beauty> beauties = beautyService.selectAll();
        beauties.forEach(System.out::println);
    }

}
