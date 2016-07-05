package com.neworin.service.impl;

import com.neworin.dao.CertiDao;
import com.neworin.entity.Certi;
import com.neworin.service.ICertiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/5.
 * Email : NewOrinZhang@gmail.com
 */
@Service
public class CertiService implements ICertiService {
    @Resource
    CertiDao certiDao;

    public List<Certi> findAll() {
        return certiDao.findAllCerti();
    }
}
