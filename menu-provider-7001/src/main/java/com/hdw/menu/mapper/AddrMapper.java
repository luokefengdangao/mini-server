package com.hdw.menu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hdw.entites.AddrEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface AddrMapper extends BaseMapper<AddrEntity> {

}
