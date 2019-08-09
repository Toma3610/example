package cn.toma.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: zqx
 * @Date: 2019-08-01 14:10
 * @Description: 构建Person 工厂接口
 */
public interface PersonInterface<T extends Person>
{

	/**
	 * 构建Person 方法
	 *
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	T create(String firstName, String lastName);


	static void main(String[] args)
	{

		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("b"));

		Supplier<Person> supplier = Person::new;
		System.out.println(supplier.get());

		Consumer<Person> greeter = (p) -> System.out.println("Hello" + p.getFirstName());
		greeter.accept(new Person("James", "LA"));

		Optional<String> optional = Optional.of("bam");
		optional.isPresent();
		optional.get();
		optional.orElse("fallBack");

		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		stringCollection
				.stream()
				.filter((s) -> s.startsWith("a"))
				.map(String::toUpperCase)
				.forEach(System.out::println);

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			map.put(i, "val" + i);
		}
		map.forEach((k,v)-> System.out.println(v));


		PersonInterface<Person> personInterface = Person::new;

		Person person = personInterface.create("Toma", "James");
		System.out.println(person);

	}

}
