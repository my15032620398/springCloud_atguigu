package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.dao.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
@author mengyue
@create 2020-10-07 2020/10/7
*/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
    int deleteByPrimaryKey(Long id);

    int defaultInsert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}