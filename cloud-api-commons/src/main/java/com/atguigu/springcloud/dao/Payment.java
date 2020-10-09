package com.atguigu.springcloud.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
@author mengyue
@create 2020-10-07 2020/10/7
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("payment")
public class Payment implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String serial;

    private static final long serialVersionUID = 1L;
}