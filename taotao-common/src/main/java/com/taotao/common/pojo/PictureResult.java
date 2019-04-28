package com.taotao.common.pojo;
/**
 * 
 * 这是上传图片所需要的返回类型
 * @author Phillip Rade Xu
 * @date 创建时间：2019年4月26日 下午11:50:01
 * @version 1.0
 */
public class PictureResult {
	//0是成功，1是失败
	private int error;
	//成功时的图片地址
	private String url;
	//失败是的错误信息
	private String message;
	
	private PictureResult(int error, String url, String message) {
		this.error = error;
		this.url = url;
		this.message = message;
	}
	//成功时调用的方法
	public static PictureResult ok(String url) {
		return new PictureResult(0, url, null);
	}
	//失败时调用的方法
	public static PictureResult error(String message) {
		return new PictureResult(1, null, message);
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
