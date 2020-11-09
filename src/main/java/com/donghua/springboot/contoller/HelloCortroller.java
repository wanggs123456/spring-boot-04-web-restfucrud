package com.donghua.springboot.contoller;

import com.donghua.springboot.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Arrays;
import java.util.Map;


@Controller
public class HelloCortroller {
    @ResponseBody
    @RequestMapping("/welcome")
    public String hello(){
        return "welcome springboot";
    }
    @RequestMapping("/success")
    //thymeleaf默认找到classpath：/templates/success.html
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("zhansan","lisi","wangwu"));
        return "success";
    }

    /**
     * springboot 默认去找静态资源下的index.html但是这里设置了就去找templates下的index页面
     * 但是为了跳转首页单独去编写方法 划不来 一般不提倡 一般直接去试图映射设置（MyMvcConfig）
     * @return
     */
    /*@RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/


}
