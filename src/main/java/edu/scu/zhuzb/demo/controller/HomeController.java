package edu.scu.zhuzb.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: edu.scu.zhuzb.demo.controller
 * @class: HomeController
 * @author: zhuzb
 * @date: 2019/12/23 9:30
 * @Version 0.0.1
 * @description: 测试Cors。
 */
@RestController
@RequestMapping("api/home")
public class HomeController {

    @RequestMapping("/content")
    public String content() {
        return "Welcome home.";
    }
}
