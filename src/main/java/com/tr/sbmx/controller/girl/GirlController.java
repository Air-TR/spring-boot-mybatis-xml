package com.tr.sbmx.controller.girl;

import com.tr.sbmx.dao.girl.GirlRepository;
import com.tr.sbmx.entity.Girl;
import com.tr.sbmx.entity.Result;
import com.tr.sbmx.service.girl.GirlService;
import com.tr.sbmx.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author taorun
 * 2017/8/3 下午5:24
 */

@RestController
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Resource
    private GirlRepository girlRepository;

    @Resource
    private GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> findAll() {
        logger.info("findAll()");
        return girlRepository.findAll();
    }

    // BindingResult 用于验证前面的 @Valid表单 有没有错误
    @PostMapping("/girls")
    public Result<Girl> save(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage()); // 失败
        }
        return ResultUtil.success(girlRepository.save(girl)); // 成功
    }

    @GetMapping("/girls/{id}")
    public Girl findOne(@PathVariable Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 必须传对象的所有参数，否则只修改传入的属性，其他属性被覆盖为null
     * @param girl
     * @return
     */
    @PostMapping("/update")
    public Girl update(Girl girl) {
        return girlRepository.save(girl);
    }

    @DeleteMapping("/girls/{id}")
    public void deleteOne(@PathVariable Integer id) {
        girlRepository.delete(id);
    }

    @GetMapping("/girls/age/{age}")
    public List<Girl> findByAge(@PathVariable Integer age) {
        return girlRepository.findByAge(age);
    }

    @PostMapping("three")
    public void insertThree() {
        girlService.insertThree();
    }

    @GetMapping("getAge/{id}")
    public void getAge(@PathVariable Integer id) throws Exception {
        girlService.getAge(id);
    }

}
