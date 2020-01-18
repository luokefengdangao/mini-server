package com.hdw.good.mapper;



import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hdw.entites.CardEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface CardMapper extends BaseMapper<CardEntity> {
	

}
