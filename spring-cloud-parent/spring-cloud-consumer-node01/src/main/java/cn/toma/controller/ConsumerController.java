package cn.toma.controller;

import cn.toma.service.HelloConsumerRemote;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqx
 * @Date: 2019-08-13 13:47
 * @Description:
 */
@RestController
public class ConsumerController
{
	@Autowired
	private HelloConsumerRemote helloRemote;

	@RequestMapping("/index")
	public String index( String name)
	{
		return helloRemote.index2(name);
	}


	public String fall(){
		return "error";
	}
}
