package com.free.yrl.demospringbooti18n.common;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

import static org.springframework.util.ObjectUtils.isEmpty;

/**
 * 基础的Controller
 *
 * @author 姚壬亮
 **/
public class BaseController {

	protected String getToken(HttpServletRequest request) {
		return request.getHeader("token");
	}

	protected String getAppType(HttpServletRequest request) {
		return request.getHeader("app_type");
	}

	protected String getMyId(HttpServletRequest request) {
		return request.getHeader("myid");
	}

	protected Long getCityId(HttpServletRequest request) {
		String cityId = request.getHeader("city_id");
		if (!isEmpty(cityId)) {
			return Long.parseLong(cityId);
		}
		return null;
	}

	protected String getPushToken(HttpServletRequest request) {
		return request.getHeader("push_token");
	}

	protected String getPlatform(HttpServletRequest request) {
		return request.getHeader("platform");
	}

	protected BigDecimal getLat(HttpServletRequest request) {
		String lat = request.getHeader("lat");
		if (isEmpty(lat)) {
			return null;
		}
		return new BigDecimal(lat);
	}

	protected BigDecimal getLng(HttpServletRequest request) {
		String lng = request.getHeader("lng");
		if (isEmpty(lng)) {
			return null;
		}
		return new BigDecimal(lng);
	}

}