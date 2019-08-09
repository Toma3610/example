package cn.toma.java8;

import com.oracle.tools.packager.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zqx
 * @Date: 2019-07-31 15:14
 * @Description:
 */
@FunctionalInterface
public interface Formula
{

	double calculate(int num);

	/**
	 * Java8 使用default 关键字 特性名称 扩展方法
	 *
	 * @param a
	 * @return
	 */
	default double sqrt(int a)
	{
		return Math.sqrt(a);
	}


	static void main(String[] args)
	{



		// Lambda 表达式默认实现
//		Formula formulas=(form)->Integer.valueOf(form);
		Formula formulas=Integer::valueOf;
		System.out.println(formulas.calculate(987));

		System.out.println(formulas.sqrt(100));


		Formula formula = new Formula()
		{
			// 匿名对象实现 Formula接口
			@Override
			public double calculate(int num)
			{
				return sqrt(num * 100);
			}
		};
		System.out.println(formula.sqrt(100));
		System.out.println(formula.calculate(100));

		// ==========================下面使用Lambda表达式实现接口并运算===============================

	}




}
