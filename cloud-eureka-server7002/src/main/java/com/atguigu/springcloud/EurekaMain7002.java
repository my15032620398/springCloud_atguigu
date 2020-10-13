package com.atguigu.springcloud;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/12 - 8:05
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/12 8:05
 * @UpdateUser:
 * @UpdateDate: 2020/10/12 8:05
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
