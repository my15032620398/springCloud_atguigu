package com.atguigu.springcloud;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/7 - 17:39
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/7 17:39
 * @UpdateUser:
 * @UpdateDate: 2020/10/7 17:39
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
