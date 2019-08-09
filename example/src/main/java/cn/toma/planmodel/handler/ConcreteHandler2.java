package cn.toma.planmodel.handler;

/**
 * @Author: zqx
 * @Date: 2019-08-06 15:54
 * @Description:
 */
public class ConcreteHandler2 extends Handler
{
	@Override
	protected Level getHandlerLevel()
	{
		return new Level(2);
	}

	@Override
	public Response response(Request request)
	{
		System.out.println("请求由处理器二 处理");
		return null;
	}
}
