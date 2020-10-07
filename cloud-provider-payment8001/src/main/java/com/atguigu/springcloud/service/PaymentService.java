package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.Payment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
@author mengyue
@create 2020-10-07 2020/10/7
*/
public interface PaymentService extends IService<Payment> {


    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

}
