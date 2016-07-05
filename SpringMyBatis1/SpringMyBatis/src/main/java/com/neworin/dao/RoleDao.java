package com.neworin.dao;

import com.neworin.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao {

    //查询Role表所有数据
    @Select("SELECT * FROM role")
    List<Role> findAllRole();
}
