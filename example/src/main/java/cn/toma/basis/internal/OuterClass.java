package cn.toma.basis.internal;

/**
 * @Author: zqx
 * @Date: 2019-08-06 17:24
 * @Description: 内部类
 */
public class OuterClass
{
	private String name;
	private Integer age;

	class InnerClass
	{
		public InnerClass()
		{
			name = "jack";
			age = 30;
		}

		public void display()
		{
			System.out.println("name:" + getName() + "\t" + "age:" + getAge());
		}
	}


	public static void main(String[] args)
	{
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.display();
	}



	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}
}
