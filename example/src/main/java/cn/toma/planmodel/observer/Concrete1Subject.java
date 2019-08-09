package cn.toma.planmodel.observer;

/**
 * @Author: zqx
 * @Date: 2019-08-06 14:15
 * @Description:
 */
public class Concrete1Subject implements Observer
{




	@Override
	public void update()
	{
		System.out.println("观察者一 收到信息");
	}
}
