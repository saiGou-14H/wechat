package com.example.login10000.controller;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.example.api.Aut;
import com.example.login10000.service.AutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;

@RestController
public class login {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    AutService autService;
    //模拟wx第三方认证平台登录
    @RequestMapping("/wxlogin")
    public String WechatLogin(HttpServletRequest request){
        String code = request.getParameter("code");
        System.out.println(code);
        return restTemplate.getForObject("https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx7b7f0fc8f32d1a53&secret=12b147fb5ccf8b0bf450defc510189a9&code="+code+"&grant_type=authorization_code",String.class);
    }

    //模拟第三方认证平台登录
    @RequestMapping("/login")
    public String Login(@RequestBody String data){
        JSONObject jsonObject = JSON.parseObject(data);
        String password = (String) jsonObject.get("password");
        System.out.println(jsonObject);
        Aut aut = autService.selectOne((String) jsonObject.get("email"));
        if(aut.getPassword().equals(password)){
            return String.valueOf(aut.getAutId());//返回第三方认证平台雪花ID
        }
        return "登陆失败";
    }
}
