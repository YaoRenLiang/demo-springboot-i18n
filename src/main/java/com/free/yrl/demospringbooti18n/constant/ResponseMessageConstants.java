package com.free.yrl.demospringbooti18n.constant;

import lombok.Getter;

import java.io.Serializable;

/**
 * 定义一些基础返回字段
 *
 * @author 姚壬亮
 **/
@Getter
public enum ResponseMessageConstants implements Serializable {

	SUCCESSFULOPERATION(0, "Successful operation", "操作成功"),
	SERVICEEXCEPTION(-100, "Network is not good, please retry.", "服务异常");


	private Integer key;
	private String value;
	private String china;

	private ResponseMessageConstants(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	private ResponseMessageConstants(Integer key, String value, String china) {
		this.key = key;
		this.value = value;
		this.china = china;
	}

	public static String getValueByKey(Integer key) {
		for (ResponseMessageConstants gender : ResponseMessageConstants.values()) {
			if (gender.getKey().equals(key)) {
				return gender.getValue();
			}
		}
		return "";
	}

	public static Integer getKeyByValue(Integer value) {
		for (ResponseMessageConstants gender : ResponseMessageConstants.values()) {
			if (value.equals(gender.getValue())) {
				return gender.getKey();
			}
		}
		return null;
	}

}