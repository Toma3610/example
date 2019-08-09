package cn.toma.planmodel.template;

/**
 * @Author: zqx
 * @Date: 2019-08-06 09:35
 * @Description: 模板方法
 */
public abstract class AbstractSort
{


	abstract void sort(Integer[] array);

	/**
	 * 抽象类 声明并定义 主义逻辑方法
	 * @param array
	 */
	public final void showArray(Integer[] array)
	{
		this.sort(array);
		System.out.println("排序结果: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);
		}

	}


}
