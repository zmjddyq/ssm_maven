package com.ssm_02.dao;//package com.com.ssm_02.test;




import com.ssm_02.pojo.Beauty;
import com.ssm_02.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zmj
 * @date 2020/5/15 9:04
 * @Description spring单元测试
 * ContextConfiguration:指定spring配置文件位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BeautyMapperTest {

    @Autowired
    private BeautyMapper beautyMapper;

//    @Test
//    public void test(){
//        Beauty beauty = new Beauty();
//        beauty.setName("李一桐");
//        beauty.setSex("女");
//        beauty.setPhone("1515313584");
//        beauty.setBorndate(DateUtil.DateFormat("2020-01-01"));
//        beautyMapper.insert(beauty);
//
//    }

    @Test
    public void test1(){
        System.out.println(beautyMapper.selectByExample(null));
        System.out.println("***************************************");
        System.out.println(beautyMapper.selectByExampleWithBLOBs(null));
    }

}
