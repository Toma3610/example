package cn.toma.java8;

import lombok.Data;

/**
 * @Author: zqx
 * @Date: 2019-08-01 14:09
 * @Description:
 */
@Data
public class Person
{



	String firstName;
	String lastName;


	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person()
	{
	}
}
