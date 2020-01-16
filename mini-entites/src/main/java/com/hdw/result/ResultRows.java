package com.hdw.result;


import java.util.List;

import lombok.Data;

@Data
public class ResultRows<T> {
	
	private boolean result = true;
	
	private List<T> rows;

}
