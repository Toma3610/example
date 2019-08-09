package cn.toma.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: zqx
 * @Date: 2019-07-31 15:25
 * @Description: Lambda 表达式示例
 */
public class LambdaExample
{


	static void java8Befor()
	{
		List<String> list = Arrays.asList("Hader", "James", "Curry", "Letter brother");
		Collections.sort(list, new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{
				return o2.compareTo(o1);
			}
		});

		// Java8 after
		Collections.sort(list, (o1, o2) ->  o2.compareTo(o1));
	}


	public static void main(String[] args)
	{
		java8Befor();
	}


}
