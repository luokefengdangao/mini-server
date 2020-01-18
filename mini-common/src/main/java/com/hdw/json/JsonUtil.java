/** 
* Copyright (C) 2012-2017 ZEEI Inc.All Rights Reserved.
* 项目名称：common
* 文件名称：JsonUtil.java
* 包  名 称：com.zeei.common.json
* 文件描述：提供字符串和json互转
* 创建日期：2017年4月27日上午10:35:34
* 
* 修改历史
* 1.0 zhou.weisheng 2017年4月27日上午10:35:34 创建文件
*
*/
package com.hdw.json;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * @类型名称：JsonUtil
 * @类型描述：Json格式转换类
 * @功能描述：提供字符串和json互转
 * @创建作者：hdw
 */
public class JsonUtil {
	private JsonUtil(){
		
	}

	/**
	 * 
	 * json2list:将字符串转化为集合
	 *
	 * @param json 字符串json格式
	 * @param clazz 类
	 * @return List<T> 返回泛型集合列表
	 */
	public static <T> List<T> json2list(String json, Class<T> clazz) {
		return JSONArray.parseArray(json, clazz);
	}

	/**
	 * 
	 * json2Object:将字符串转化为对象
	 *
	 * @param json 字符串json格式
	 * @param clazz 类
	 * @return T 泛型对象
	 */
	public static <T> T json2Object(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}

	/**
	 * 
	 * object2json:将对象或者集合转化为json字符串
	 *
	 * @param object 对象火鸡和
	 * @return String 返回字符串json格式
	 */
	public static String object2json(Object object) {
		return JSON.toJSONString(object);
	}

}
