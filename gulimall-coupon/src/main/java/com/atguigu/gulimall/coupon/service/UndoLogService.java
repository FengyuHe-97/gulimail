package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author fengyuhe
 * @email banxiabian@gmail.com
 * @date 2022-01-23 21:28:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

