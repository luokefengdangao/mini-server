package com.hdw.result;

import lombok.Data;

@Data
public class ResultData<T> {

	private boolean result;

	private T data;

}
