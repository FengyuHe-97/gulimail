package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fengyuhe
 * @email banxiabian@gmail.com
 * @date 2022-01-23 21:58:01
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
