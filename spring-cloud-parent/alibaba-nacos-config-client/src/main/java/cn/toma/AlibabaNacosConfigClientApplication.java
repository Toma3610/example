package cn.toma;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 动态刷新配置
@RestController
@SpringBootApplication
public class AlibabaNacosConfigClientApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(AlibabaNacosConfigClientApplication.class, args);
	}

	@Value("${toma.title}")
	private String title;

	@RequestMapping("/config")
	public String config()
	{
		return title;
	}

}
