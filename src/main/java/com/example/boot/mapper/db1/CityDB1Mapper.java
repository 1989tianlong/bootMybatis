package com.example.boot.mapper.db1;

import com.example.boot.domain.db1.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityDB1Mapper {

    @Select("select id, name, state, country from city where state = #{state}")
    City findByState(@Param("state") String state);
}
