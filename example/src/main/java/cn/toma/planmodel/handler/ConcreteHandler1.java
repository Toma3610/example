package cn.toma.planmodel.handler;

/**
 * @Author: zqx
 * @Date: 2019-08-06 15:54
 * @Description:
 */
public class ConcreteHandler1 extends Handler
{
	@Override
	protected Level getHandlerLevel()
	{
		return new Level(1);
	}

	@Override
	public Response response(Request request)
	{
		System.out.println("请求由处理器一 处理");
		return null;
	}
}
