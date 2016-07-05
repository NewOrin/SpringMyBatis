package com.neworin.service.impl;

import com.neworin.dao.UserDao;
import com.neworin.entity.User;
import com.neworin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAllUser();
    }

    public void add(User user) {
        userDao.addUser(user);
    }
}
