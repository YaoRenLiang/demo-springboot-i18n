package com.free.yrl.demospringbooti18n.base;

import com.free.yrl.demospringbooti18n.base.i18n.Resources;
import com.free.yrl.demospringbooti18n.constant.ResponseMessageConstants;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

/**
 * @author: 姚壬亮
 * @description: 基础的Controller
 * @date: 2019-10-11 10:01
 **/
@Getter
@ApiModel(value = "response", description = "响应结果")
public class ResponseMessage<T> implements Serializable {

	@ApiModelProperty(value = "状态码", required = true)
	private Integer code;

	@ApiModelProperty("调用结果消息")
	private String message;

	@ApiModelProperty(value = "响应数据")
	private T data;

	private ResponseMessage(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
		if (isEmpty(code)) {
			this.code = ResponseMessageConstants.SERVICEEXCEPTION.getKey();
		}
		if (isEmpty(message)) {
			this.message = ResponseMessageConstants.SERVICEEXCEPTION.getValue();
		}
	}

	/*返回错误*/
	public static <T> ResponseMessage<T> setErrorResult(ResponseMessageConstants constants) {
		Integer key = constants.getKey();
		return new ResponseMessage(key, msg(key), null);
	}

	/*返回错误*/
	public static <T> ResponseMessage<T> setErrorResult(Integer code) {
		return new ResponseMessage(code, msg(code), null);
	}

	/*返回错误*/
	public static <T> ResponseMessage<T> setErrorResult(Integer code, String message) {
		return new ResponseMessage(code, msg(code, message), null);
	}

	/*返回成功*/
	public static <T> ResponseMessage<T> setSuccessResult() {
		Integer key = ResponseMessageConstants.SUCCESSFULOPERATION.getKey();
		return new ResponseMessage(key, msg(key), null);
	}

	/*返回成功*/
	public static <T> ResponseMessage<T> setSuccessResult(Object data) {
		Integer key = ResponseMessageConstants.SUCCESSFULOPERATION.getKey();
		if (data instanceof String || data instanceof Integer || data instanceof Date) {
			Map map = Maps.newHashMap();
			map.put("result", data);
			return new ResponseMessage(key, msg(key), map);
		}
		if (isEmpty(data)) {
			data = null;
		}
		return new ResponseMessage(key, msg(key), data);
	}

	private static String msg(Integer key, Object... params) {
		return Resources.getMessage("CODE_" + key, params);
	}

}