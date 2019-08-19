package cn.toma.service.impl;

import cn.toma.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: zqx
 * @Date: 2019-08-19 11:46
 * @Description:
 */
@Service
public class HelloDubboImpl implements HelloDubboService
{
	@Override
	public String helloNacosDubbo(String name)
	{
		return "this is nacos dubbo:" + name;
	}
}
