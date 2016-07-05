package com.neworin.dao;

import com.neworin.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据访问层接口
 */
public interface UserDao {
    // 添加用户
    @Insert("INSERT INTO user(uname,upwd) VALUES(#{uname},#{upwd})")
     void addUser(User user);

    //查询所有用户
    @Select("SELECT * FROM user")
     List<User> findAllUser();
}