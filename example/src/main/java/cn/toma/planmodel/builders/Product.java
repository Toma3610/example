package cn.toma.planmodel.builders;

/**
 * @Author: zqx
 * @Date: 2019-08-05 17:28
 * @Description: 构建者模式 构建产品本身对象
 */
public class Product
{

	private String name;

	private String type;


	public void showProduct()
	{
		System.out.println("名称:" + name +"\t"+ "型号:" + type);
	}


	public Product()
	{
	}

	public Product(String name, String type)
	{
		this.name = name;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}
