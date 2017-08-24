package com.tr.sbmx.service.city;

import com.tr.sbmx.dao.city.CityRepository;
import com.tr.sbmx.entity.Result;
import com.tr.sbmx.mapper.ICityMapper;
import com.tr.sbmx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author taorun
 * 2017/8/8 下午2:38
 */

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Resource
    private ICityMapper cityMapper;

    //------------- jpa -------------
    public Result findAll() {
        return ResultUtil.success(cityRepository.findAll());
    }

    public Result findOne(Integer id) {
        return ResultUtil.success(cityRepository.findOne(id));
    }

    //------------- xml -------------
    public Result selectList() {
        return ResultUtil.success(cityMapper.selectList());
    }

    public Result selectByLocation(String location) {
        return ResultUtil.success(cityMapper.selectByLocation(location));
    }

}
