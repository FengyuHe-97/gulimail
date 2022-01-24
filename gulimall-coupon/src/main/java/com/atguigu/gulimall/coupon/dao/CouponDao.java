package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fengyuhe
 * @email banxiabian@gmail.com
 * @date 2022-01-23 21:28:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
