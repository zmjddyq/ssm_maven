package com.ssm_02.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ssm_02.pojo.Beauty;
import com.ssm_02.service.BeautyService;

import java.util.List;

/**
 * @author zmj
 * @date 2020/5/14 18:47
 * @Description
 */
@Controller
public class BeautyController {

    @Autowired
    private BeautyService beautyService;

    @RequestMapping("/getBeautys")
    public String getBeautys(@RequestParam(value = "pn",defaultValue = "1") Integer pageNum, Model model){
        System.out.println("我被訪問了");
        PageHelper.startPage(pageNum,5);
        List<Beauty> beauties = beautyService.selectAll();
        PageInfo<Beauty> beautyPageInfo = new PageInfo<Beauty>(beauties);
        model.addAttribute("PageInfo",beautyPageInfo);
        return "success";
    }
}
