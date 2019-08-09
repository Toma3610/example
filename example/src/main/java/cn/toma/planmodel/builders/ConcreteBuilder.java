package cn.toma.planmodel.builders;

/**
 * @Author: zqx
 * @Date: 2019-08-05 17:33
 * @Description:
 */
public class ConcreteBuilder extends Builder
{
	private Product product =new Product();


	@Override
	public void setPart(String arg1, String arg2)
	{
		product.setName(arg1);
		product.setType(arg2);
	}

	@Override
	public Product getProduct()
	{
		return product;
	}
}
