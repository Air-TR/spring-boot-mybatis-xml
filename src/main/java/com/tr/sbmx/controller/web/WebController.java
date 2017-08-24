package com.tr.sbmx.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author taorun
 * 2017/8/8 上午10:23
 */

@ApiIgnore
@Controller
public class WebController {

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.baidu.com");
        // return模板文件的名称，对应src/main/resources/templates/hello.html
        return "hello";
    }

    @RequestMapping("/index")
    public String in() {
        return "index";
    }

}