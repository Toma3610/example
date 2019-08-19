package cn.toma.service;

import cn.toma.hystrix.HelloRemoteHystrix;
import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zqx
 * @Date: 2019-08-13 12:00
 * @Description: spring-cloud-produce 服务提供者 远程服务名
 * fallback 设置 Hystrix 服务熔断响应处理
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloConsumerRemote
{

	@LoadBalanced
	@RequestMapping(value = "/index")
	String index(@RequestParam String param);

	/**
	 * 打印调用其他服务的日志信息 默认是关闭的 yaml文件需要配置
	 *
	 * 该Feign Client的配置类，注意：
	 * 1. 该类可以独立出去；
	 * 2. 该类上也可添加@Configuration声明是一个配置类；
	 * 配置类上也可添加@Configuration注解，声明这是一个配置类；
	 * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
	 * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
	 * 个人建议：像我一样，不加@Configuration注解
	 *
	 */
//	class UserFeignConfig
//	{
//		@Bean
//		public Logger.Level logger()
//		{
//			return Logger.Level.FULL;
//		}
//	}
}
