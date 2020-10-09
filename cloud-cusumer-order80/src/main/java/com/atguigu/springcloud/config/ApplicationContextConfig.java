package com.atguigu.springcloud.config;/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/7 - 17:46
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2020/10/7 17:46
 * @UpdateUser:
 * @UpdateDate: 2020/10/7 17:46
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
