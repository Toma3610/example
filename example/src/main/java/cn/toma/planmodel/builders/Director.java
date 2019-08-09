package cn.toma.planmodel.builders;

/**
 * @Author: zqx
 * @Date: 2019-08-05 17:34
 * @Description: 建造者模式
 */
public  class Director
{

	private Builder builder = new ConcreteBuilder();

	public Product getProductA()
	{
		builder.setPart("宝马", "X5");
		return builder.getProduct();
	}

	public Product getProductB()
	{
		builder.setPart("奔驰", "G");
		return builder.getProduct();
	}

	public static void main(String[] args)
	{
		Director director = new Director();
		Product productA = director.getProductA();
		productA.showProduct();
		Product productB = director.getProductB();
		productB.showProduct();
	}


}
