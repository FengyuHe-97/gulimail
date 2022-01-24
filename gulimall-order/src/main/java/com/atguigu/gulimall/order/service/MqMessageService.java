package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author fengyuhe
 * @email banxiabian@gmail.com
 * @date 2022-01-23 21:51:39
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

