package com.hdw.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hdw.entites.AdEntity;

@Repository
@Mapper
public interface AdMapper extends BaseMapper<AdEntity>{

	
}
