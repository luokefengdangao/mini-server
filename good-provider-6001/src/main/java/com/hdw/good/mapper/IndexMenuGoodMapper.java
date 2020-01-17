package com.hdw.good.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hdw.entites.IndexMenuEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface IndexMenuGoodMapper extends BaseMapper<IndexMenuEntity> {

}
