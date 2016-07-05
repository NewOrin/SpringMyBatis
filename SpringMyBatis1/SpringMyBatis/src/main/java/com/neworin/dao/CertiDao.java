package com.neworin.dao;

import com.neworin.entity.Certi;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CertiDao {
    @Select("SELECT * FROM certi")
    List<Certi> findAllCerti();
}
