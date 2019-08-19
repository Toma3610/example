package cn.toma.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqx
 * @Date: 2019-08-16 11:43
 * @Description:
 */
@RestController
public class HelloController
{


	@Value("${profile}")
	private String profile;


	@RequestMapping("/profile")
	public Object hello()
	{
		return this.profile;
	}

}
