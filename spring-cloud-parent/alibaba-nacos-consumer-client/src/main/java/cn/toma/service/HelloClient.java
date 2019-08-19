package cn.toma.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zqx
 * @Date: 2019-08-16 15:49
 * @Description:
 */
@FeignClient("alibaba-nacos-producer-server")
public interface HelloClient
{
	@GetMapping("/hello")
	String hello(@RequestParam String name);
}
