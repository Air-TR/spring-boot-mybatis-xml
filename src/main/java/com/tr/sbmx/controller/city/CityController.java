package com.tr.sbmx.controller.city;

import com.tr.sbmx.entity.City;
import com.tr.sbmx.entity.Result;
import com.tr.sbmx.service.city.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author taorun
 * 2017/8/8 下午2:52
 */

@RestController
@RequestMapping("/city")
public class CityController {

    @Resource
    private CityService cityService;

    //------------- jpa -------------
    @GetMapping("/cities")
    public Result findAll() {
        return cityService.findAll();
    }

    @GetMapping("/city/{id}")
    public Result findOne(@PathVariable Integer id) {
        return cityService.findOne(id);
    }

    @GetMapping("/city")
    public Result city(Integer id) {
        return cityService.findOne(id);
    }

    //------------- xml -------------
    @GetMapping("list")
    public Result<City> list() {
        return cityService.selectList();
    }

    @PostMapping("/detail1")
    public Result<City> detail1(String location) {
        return cityService.selectByLocation(location);
    }

    @PostMapping("/detail2")
    public Result detail2(City city) {
        return cityService.selectByLocation(city.getLocation());
    }

}
