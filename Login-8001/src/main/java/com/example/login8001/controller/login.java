package com.example.login8001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class login {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String test(HttpServletRequest request){
        String code = request.getParameter("code");
        System.out.println(code);
        return restTemplate.getForObject("https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx7b7f0fc8f32d1a53&secret=12b147fb5ccf8b0bf450defc510189a9&code="+code+"&grant_type=authorization_code",String.class);

    }
}
