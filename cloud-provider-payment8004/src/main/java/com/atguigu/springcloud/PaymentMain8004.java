package com.atguigu.springcloud;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/13 - 17:00
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/13 17:00
 * @UpdateUser:
 * @UpdateDate: 2020/10/13 17:00
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
