package cn.itdashu.aigou.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka的客户端
/*
*  犯的错误 一直启动不了 入口类 解决：重启idea 靠
* */
public class PlatServiceApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication8001.class);
    }
}
