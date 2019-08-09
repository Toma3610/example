package cn.toma.planmodel.template;

/**
 * @Author: zqx
 * @Date: 2019-08-06 09:45
 * @Description: 实现抽象方法
 */
public class ConcreteSort extends AbstractSort
{
	@Override
	void sort(Integer[] array)
	{
		selectSort(array);
	}


	/**
	 * 冒泡排序
	 *
	 * @param array 数组
	 */
	private void selectSort(Integer[] array)
	{

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = array.length - 1; j > i; j--) {

				if (array[j] > array[j - 1]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Integer[] array = {23, 56, 1, 56, 89, 23, 12, 5, 89, 229, 568};
		ConcreteSort concreteSort = new ConcreteSort();
		concreteSort.showArray(array);
	}
}
