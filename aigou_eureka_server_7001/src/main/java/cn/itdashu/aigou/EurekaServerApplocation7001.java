package cn.itdashu.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心 模块
 */
@SpringBootApplication
@EnableEurekaServer//注册中心 服务端
public class EurekaServerApplocation7001 {
    public static void main(String[] args) {
        /**
         * 粗心 犯的错误 ：传入参数写错了；导致 找不到这个bean ;原因：这个入口类 就是bean
         */
        SpringApplication.run(EurekaServerApplocation7001.class);
    }
}
