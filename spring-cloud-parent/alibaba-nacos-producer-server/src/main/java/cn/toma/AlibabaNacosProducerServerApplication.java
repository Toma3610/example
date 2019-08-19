package cn.toma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class AlibabaNacosProducerServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(AlibabaNacosProducerServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam String name)
	{
		System.err.println("invoked name = " + name);
		return "hello " + name;
	}

}
