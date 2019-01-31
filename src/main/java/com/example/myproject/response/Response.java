package com.example.myproject.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一的返回结果类
 * @author JoeH
 *
 * @param <T>
 */
@Data
@JsonInclude(Include.NON_NULL)
public class Response<T>  implements Serializable{

	private static final long serialVersionUID = 4468264243627252256L;

	/**
	 * 返回状态
	 */
	Integer httpCode = HttpCode.OK.value();
	
	/**
	 * 返回消息
	 */
	String msg;
	
	/**
	 * 返回对象
	 */
	T result;
	
	public Response() {
		super();
	}
	
//	public Response(T result) {
//		this.result = result;
//		this.msg = result != null ? "请求成功！" : "请求失败！";
//		this.httpCode = result != null ? HttpCode.OK.value() : HttpCode.INTERNAL_SERVER_ERROR.value();
//	}

	public Response(T result) {
		this.result = result;
		this.httpCode = HttpCode.OK.value();
	}

	public Response(T result, String msg) {
		this.result = result;
		this.msg = msg;
		this.httpCode = result != null ? HttpCode.OK.value() : HttpCode.BAD_REQUEST.value();
	}
	
	public Response(T result, String msg, HttpCode httpCode) {
		this.result = result;
		this.msg = msg;
		this.httpCode = httpCode.value();
	}


}
