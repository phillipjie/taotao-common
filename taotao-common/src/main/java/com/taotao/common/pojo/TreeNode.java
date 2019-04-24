package com.taotao.common.pojo;
/**
 * 
 * 这是商品类目所需要的返回值pojo
 * @author Phillip Rade Xu
 * @date 创建时间：2019年4月24日 下午3:49:42
 * @version 1.0
 */
public class TreeNode {
	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
