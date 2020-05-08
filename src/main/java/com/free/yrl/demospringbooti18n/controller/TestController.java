package com.free.yrl.demospringbooti18n.controller;

import com.free.yrl.demospringbooti18n.base.ResponseMessage;
import com.free.yrl.demospringbooti18n.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.free.yrl.demospringbooti18n.base.ResponseMessage.error;

/**
 * 测试相关操作
 *
 * @author 姚壬亮
 **/
@Slf4j
@Api(tags = "测试相关操作")
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

	@ApiOperation("国际化测试")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "accept-language", value = "语言", dataType = "int", example = "en", required = true, paramType = "header"),
			@ApiImplicitParam(name = "code", value = "测试返回码", dataType = "int", example = "-100", required = true),
	})
	@GetMapping("/test")
	public ResponseMessage<Object> test(Integer code) {
		return error(code);
	}

}