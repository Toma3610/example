package cn.toma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"cn.toma.**.dao"})
@SpringBootApplication
public class ShardingSpringbootApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(ShardingSpringbootApplication.class, args);
	}

}
