package com.tr.sbmx.mapper;

import com.tr.sbmx.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author taorun
 * 2017/8/8 下午2:36
 */

@Repository
@Mapper
public interface ICityMapper {

    List<City> selectList();

    City selectByLocation(String location);

}




