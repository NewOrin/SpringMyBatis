package com.neworin.service.impl;

import com.neworin.dao.RoleDao;
import com.neworin.entity.Role;
import com.neworin.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private RoleDao roleDao;

    public List<Role> findAll() {
        return roleDao.findAllRole();
    }
}
