package com.hdw.menu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hdw.entites.CateGoryEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface CateGoryMapper extends BaseMapper<CateGoryEntity> {

}
