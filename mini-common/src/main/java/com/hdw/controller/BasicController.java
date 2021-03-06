package com.hdw.controller;


import java.util.List;

import com.hdw.result.ResultData;
import com.hdw.result.ResultRows;

public class BasicController {
	
	/**
	 * 
	 * createResultVO: 创建结果返回值
	 * 
	 * @param rows 结果集
	 * @param result 查询结果
	 * @return ResultRows<T>
	 */
	public <T> ResultRows<T> createResultVO(List<T> rows, boolean result) {
		ResultRows<T> resultVO = new ResultRows<T>();
		resultVO.setRows(rows);
		resultVO.setResult(result);
		return resultVO;
	}
	
	/**
	 * 
	 * createResultVO: 创建结果返回值
	 * 
	 * @param rows 结果集
	 * @param result 查询结果
	 * @return ResultRows<T>
	 */
	public <T> ResultRows<T> createResultVO(List<T> rows) {
		return createResultVO(rows,true);
	}

	/**
	 * 
	 * createResultData:创建单个对象返回值
	 * 
	 * @param data   对象
	 * @param result 查询结果
	 * @return ResultData<T>
	 */
	public <T> ResultData<T> createResultData(T data, boolean result) {

		ResultData<T> resultData = new ResultData<T>();
		resultData.setData(data);
		resultData.setResult(result);
		return resultData;

	}

	/**
	 * 
	 * createResultData:创建单个对象返回值
	 * 
	 * @param data   对象
	 * @param result 查询结果
	 * @return ResultData<T>
	 */
	public <T> ResultData<T> createResultData(T data) {

		return createResultData(data, true);

	}

}
