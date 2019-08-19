package cn.toma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者  @EnableDiscoveryClient 该注解会往服务注册中心自动注册
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SpringCloudProducerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringCloudProducerApplication.class, args);
	}

	@RequestMapping("/index")
	public String index(@RequestParam String param)
	{
		return "hello  " + param + ",this is spring-cloud-producer";
	}

}

