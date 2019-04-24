package com.taotao.common.pojo;

import java.util.List;

/**
 * 这是easyUI显示所有数据的格式
 * 
 * @author Phillip Rade Xu
 * @date 创建时间：2019年4月22日 下午11:47:00
 * @version 1.0
 */
public class EUDataGridResult {
	private Long total;
	private List<?> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
