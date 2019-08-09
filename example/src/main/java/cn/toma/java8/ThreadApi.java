package cn.toma.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.IntStream;

/**
 * @Author: zqx
 * @Date: 2019-08-01 16:25
 * @Description:
 */
public class ThreadApi
{


	public static void main(String[] args)
	{
//		testThread1();
//		executorServiceTEst();
		ThreadApi threadApi = new ThreadApi();
		threadApi.concurrents();


	}

	StampedLock lock =new StampedLock();

	LongAdder count = new LongAdder();

	 void increment()
	{

		count.increment();
	}

	private void concurrents()
	{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 10000).forEach(i -> executor.submit(count::increment));
		executor.shutdown();
		System.out.println(count);

	}


	private static void executorServiceTEst()
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(() ->
		{
			String name = Thread.currentThread().getName();
			System.out.println(name);
		});
		executorService.shutdownNow();

	}

	private static void testThread1()
	{
		Runnable task = () ->
		{
			String name = Thread.currentThread().getName();
			System.out.println("hello:" + name);
		};

		task.run();
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("down");


		Runnable task2 = () ->
		{
			String name = Thread.currentThread().getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello:" + name);
		};

		task2.run();
		Thread thread2 = new Thread(task2);
		thread2.start();
		System.out.println("down");
	}


}