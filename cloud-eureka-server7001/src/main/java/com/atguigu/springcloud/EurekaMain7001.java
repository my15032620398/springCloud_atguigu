package com.atguigu.springcloud;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/10 - 8:51
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/10 8:51
 * @UpdateUser:
 * @UpdateDate: 2020/10/10 8:51
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
