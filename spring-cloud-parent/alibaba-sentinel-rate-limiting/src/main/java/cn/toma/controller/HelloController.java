package cn.toma.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqx
 * @Date: 2019-08-19 09:40
 * @Description:
 */
@RestController
public class HelloController
{

	@RequestMapping("/hello")
	public Object hello(String name)
	{
		return "hello sentinel: " + name;
	}

}
