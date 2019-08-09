package cn.toma.planmodel.observer;

/**
 * @Author: zqx
 * @Date: 2019-08-06 14:17
 * @Description: 具体的观察者
 */
public class ConcreteSubject extends Subject

{
	@Override
	public void doSomething()
	{
		System.out.println("被观察者事件发生");
		this.notifyObserver();
	}



	public static void main(String[] agrs){

		Subject sub =new ConcreteSubject();
		sub.addVector(new Concrete1Subject());
		sub.addVector(new Concrete2Subject());

		sub.doSomething();
	}
}
