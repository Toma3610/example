package cn.toma.planmodel.prototype;

/**
 * @Author: zqx
 * @Date: 2019-08-05 17:57
 * @Description:
 */
public class ConcretePrototype extends Prototype
{

	public void show()
	{
		System.out.println("原型模式实现");
	}


	public static void main(String[] args)
	{
		ConcretePrototype concretePrototype = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clone = (ConcretePrototype) concretePrototype.clone();
			clone.show();
		}
	}


}
