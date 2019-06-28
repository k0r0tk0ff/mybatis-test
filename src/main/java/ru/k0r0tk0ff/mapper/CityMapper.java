package ru.k0r0tk0ff.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ru.k0r0tk0ff.domain.City;

@Mapper
public interface CityMapper {
    @Select("select id, name, state, country from city where state = #{state}")
    City findByState(@Param("state") String state);
}
