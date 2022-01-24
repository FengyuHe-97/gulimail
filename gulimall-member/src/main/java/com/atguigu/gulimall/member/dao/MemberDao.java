package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fengyuhe
 * @email banxiabian@gmail.com
 * @date 2022-01-23 21:39:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
