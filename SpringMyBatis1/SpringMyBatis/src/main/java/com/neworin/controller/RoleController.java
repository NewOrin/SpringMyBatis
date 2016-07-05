package com.neworin.controller;

import com.neworin.entity.Role;
import com.neworin.service.IRoleService;
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
@RequestMapping("/role")
public class RoleController {

    @Resource
    private IRoleService roleService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Role> list = roleService.findAll();
        mv.addObject("roleList", list);
        mv.setViewName("result");
        for (Role r : list) {
            System.out.println(r);
        }
        return mv;
    }
}
