package cn.toma.planmodel.observer;

import java.util.Vector;

/**
 * @Author: zqx
 * @Date: 2019-08-06 14:06
 * @Description: 观察者模式 --->被观察者
 */
public abstract class Subject
{

	/**
	 * 使用线程安全的集合
	 */
	private Vector<Observer> obs = new Vector<>();

	public void addVector(Observer obs)
	{
		this.obs.add(obs);
	}

	public void delObserver(Observer obs)
	{
		this.obs.remove(obs);
	}

	protected void notifyObserver()
	{
		for (Observer o : obs) {
			o.update();
		}
	}

	public abstract void doSomething();


}

