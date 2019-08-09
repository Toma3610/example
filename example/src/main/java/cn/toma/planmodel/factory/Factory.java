package cn.toma.planmodel.factory;

/**
 * @Author: zqx
 * @Date: 2019-08-05 15:17
 * @Description: 工厂方法模式
 */
public class Factory implements IFactory
{
	@Override
	public ICar createCar()
	{


		ICar.Engine engine = new ICar.Engine("Mazda");
		ICar.Underpan underpan = new ICar.Underpan("Audi");
		ICar.Wheel wheel = new ICar.Wheel("米其林");
		ICar iCar = new ICar(engine, underpan, wheel);
		iCar.show();
		return iCar;
	}


	public static void  main(String[] args){
		// 工厂实现类 实现汽车组成接口
		IFactory iFactory =new Factory();
		iFactory.createCar();
	}

}
