package cn.toma.planmodel.handler;

/**
 * @Author: zqx
 * @Date: 2019-08-06 15:38
 * @Description:
 */
public class Response
{


	public static void main(String[] args)
	{
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();

		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler1);

		Response response = handler1.handleRequest(new Request(new Level(1)));

	}

}
