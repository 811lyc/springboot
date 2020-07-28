package com.test.test.task.controller;

import com.test.test.common.entity.IntegralResponse;
import com.test.test.task.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LYC
 * @desc
 * @create 2020-07-28 16:46
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("address")
public class TaddressController {

	private final RedisService redisService;

	@GetMapping
	public IntegralResponse selectAddressList(){
		return new IntegralResponse().data("");
	}
}
