package cn.toma.planmodel.factory;

/**
 * @Author: zqx
 * @Date: 2019-08-05 15:15
 * @Description:
 */
public class ICar
{


	private Engine engine;
	private Underpan underpan;
	private Wheel wheel;


	static class Engine
	{
		private String name;

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public Engine(String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "Engine{" +
					"name='" + name + '\'' +
					'}';
		}

		public Engine()
		{
		}


	}


	static class Underpan
	{
		private String name;

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public Underpan(String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "Underpan{" +
					"name='" + name + '\'' +
					'}';
		}

		public Underpan()
		{
		}
	}

	static class Wheel
	{

		private String name;

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public Wheel(String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "Wheel{" +
					"name='" + name + '\'' +
					'}';
		}

		public Wheel()
		{
		}
	}


	public ICar(Engine engine, Underpan underpan, Wheel wheel)
	{
		this.engine = engine;
		this.underpan = underpan;
		this.wheel = wheel;

	}

	public ICar()
	{
	}

	@Override
	public String toString()
	{
		return "ICar{" +
				"engine=" + engine +
				", underpan=" + underpan +
				", wheel=" + wheel +
				'}';
	}

	public void show(){
		System.out.println(toString());
	}


}
