package com.hdw.good.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hdw.entites.GoodEntity;
import com.hdw.mapper.BaseMapper;

@Repository
@Mapper
public interface GoodMapper extends BaseMapper<GoodEntity>{
	
	@Select("SELECT g.goodid,g.goodName,g.price,g.imgsrc,m.menuName,m.menuCode FROM T_MINI_GOOD g "
			+ "JOIN T_MINI_INDEX_GOOD i on i.goodid = g.goodid " + "JOIN T_MINI_INDEX_MENU m on m.id = i.indexmenuid "
			+ "")
	List<GoodEntity> selectIndexMenuGood();


}
