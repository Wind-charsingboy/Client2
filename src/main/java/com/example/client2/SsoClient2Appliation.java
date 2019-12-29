package com.example.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Appliation {
    //查看当前系统登录的用户的信息
    @GetMapping("/user")
    public Authentication usr(Authentication user){
        return user;
    }


    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Appliation.class, args);
    }

}
