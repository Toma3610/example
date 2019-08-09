package cn.toma.planmodel.prototype;

/**
 * @Author: zqx
 * @Date: 2019-08-05 17:55
 * @Description: 原型模式 实现Cloneable 的clone方法即可
 */
public class Prototype implements Cloneable

{

	@Override
	public Prototype clone()
	{
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}

}
