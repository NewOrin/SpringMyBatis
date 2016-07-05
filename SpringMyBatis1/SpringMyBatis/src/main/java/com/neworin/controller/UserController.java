package com.neworin.controller;

import com.neworin.entity.User;
import com.neworin.service.IUserService;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:applicationContext.xml"})
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("findAll")
    public ModelAndView findAllUser() {
        ModelAndView mv = new ModelAndView();
        List<User> list = userService.findAll();
        for (User u : list) {
            System.out.println(u);
        }
        mv.addObject("userList", list);
        mv.setViewName("result");
        return mv;
    }

    @Test
    public void addUser() {
        User user = new User(3, "杜兰特", "111111");
        userService.add(user);
        System.out.println("Success.");
    }
}
