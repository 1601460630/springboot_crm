package jyx.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        map.put("welcome", "我tmd想打人");
        //放一个测试数据
        return "result";
    }

    @ResponseBody
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> map) {
        //map.put("welcome", "我tmd想打人");
        //放一个测试数据
        return "烦死了";
    }
}
