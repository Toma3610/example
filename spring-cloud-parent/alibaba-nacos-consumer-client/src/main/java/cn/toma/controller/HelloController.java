package cn.toma.controller;

import cn.toma.service.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zqx
 * @Date: 2019-08-16 15:51
 * @Description:
 */
@RestController
public class HelloController
{
	/**
	 * 通过负载均衡客户端 可以实现对服务提供者的负载均衡 默认是轮询
	 */
//	@Autowired
//	LoadBalancerClient loadBalancerClient;

	@Autowired
	HelloClient helloClient;

	@LoadBalanced
	@GetMapping("/test")
	public String test(@RequestParam String name)
	{
//		// 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
//		ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-producer-server");
//		String url = serviceInstance.getUri() + "/hello?name=" + name;
//		RestTemplate template = new RestTemplate();
//		String result = template.getForObject(url, String.class);
//
//		return "Invoke: " + url + ",return:" + result;

//		step 2 使用feign 请求服务实例
		String result = helloClient.hello(name);
		return "Return: "+ result;

	}
}
