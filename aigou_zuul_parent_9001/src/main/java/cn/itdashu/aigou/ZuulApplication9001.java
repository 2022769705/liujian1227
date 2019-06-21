package cn.itdashu.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cn.itdashu.aigou.swagger")
@SpringBootApplication
//开启客户端
@EnableEurekaClient
//开启网关
@EnableZuulProxy
//@EnableZuulServer //两个都可以用
public class ZuulApplication9001  {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9001.class);
    }
}
