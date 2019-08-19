package cn.toma.hystrix;

import cn.toma.service.HelloConsumerRemote;
import org.springframework.stereotype.Component;

/**
 * @Author: zqx
 * @Date: 2019-08-13 14:19
 * @Description: 设置Hystrix 服务熔断 返回响应
 */
@Component
public class HelloRemoteHystrix implements HelloConsumerRemote
{

	@Override
	public String index2(String param)
	{
		return "hello" + param + ", this messge send failed ";
	}
}
