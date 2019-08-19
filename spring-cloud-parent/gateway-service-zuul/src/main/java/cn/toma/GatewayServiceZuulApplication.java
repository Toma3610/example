package cn.toma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 网关支持
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayServiceZuulApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(GatewayServiceZuulApplication.class, args);
	}

}
