package com.neworin.controller;

import com.neworin.entity.Certi;
import com.neworin.service.ICertiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
@Controller
@RequestMapping("/certi")
public class CertiController {

    @Resource
    ICertiService certiService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Certi> list = certiService.findAll();
        mv.addObject("certiList", list);
        mv.setViewName("result");
        for (Certi c : list) {
            System.out.println(c);
        }
        return mv;
    }
}
