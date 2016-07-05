package com.neworin.service;

import com.neworin.dao.UserDao;
import com.neworin.entity.User;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
public interface IUserService {

    List<User> findAll();

    void add(User user);
}
