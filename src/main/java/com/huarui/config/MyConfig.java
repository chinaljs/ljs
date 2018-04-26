package com.huarui.config;


import com.huarui.common1.MyTool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/4/24.
 * @Configuration 这个类就相当于过去的beans.xml
 */
@Configuration
public class MyConfig {

    @Value("${mytool.serverpath}")
    private String serverPath;
    @Bean
    public MyTool getMyTool(){
        return new MyTool(serverPath);
    }
}
