package cn.toma.service;

import cn.toma.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zqx
 * @Date: 2019-08-13 12:00
 * @Description: spring-cloud-produce 服务提供者 远程服务名
 * fallback 设置 Hystrix 服务熔断响应处理
 */
@FeignClient(name = "spring-cloud-producer2", fallback = HelloRemoteHystrix.class)
public interface HelloConsumerRemote
{

	@RequestMapping(value = "/index")
	String index2(@RequestParam String param);

}
