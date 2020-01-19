package com.hdw.good.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hdw.entites.CardEntity;
import com.hdw.entites.GoodEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface CardMapper extends BaseMapper<CardEntity> {
	
	/**
	 * 
	 * selectCardGood: 查询用户购物车信息
	 * 
	 * @param userId
	 * @return List<GoodEntity>
	 */
	List<GoodEntity> selectCardGood(@Param("userId") String userId);

}
