package cn.toma.planmodel.singleton;

/**
 * @Author: zqx
 * @Date: 2019-08-05 14:40
 * @Description: 单例模式 懒汉模式
 */
public class SingletonLh
{

	private static SingletonLh singletonLh;

	private SingletonLh()
	{
	}

	public SingletonLh getInstance()
	{
		if (singletonLh == null) {

			return singletonLh = new SingletonLh();
		}
		return singletonLh;
	}


}
