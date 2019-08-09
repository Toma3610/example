package cn.toma.planmodel.singleton;

/**
 * @Author: zqx
 * @Date: 2019-08-05 14:32
 * @Description: 单例模式  恶汉模式
 */
public class SingletonEh
{

	private static SingletonEh singletonEh = new SingletonEh();

	private SingletonEh()
	{
	}

	public static SingletonEh getInstance()
	{
		return singletonEh;
	}
}
