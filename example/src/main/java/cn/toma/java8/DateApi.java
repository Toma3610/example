package cn.toma.java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * @Author: zqx
 * @Date: 2019-08-01 15:42
 * @Description:
 */
public class DateApi
{


	public static void main(String[] args)
	{
		Clock clock =Clock.systemDefaultZone();
		System.out.println(clock.getZone());
		long millis = clock.millis();
		System.out.println(millis);
		Instant instant = clock.instant();
		Date from = Date.from(instant);
		System.out.println(from);


		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate plus = localDate.plus(1, ChronoUnit.DAYS);
		System.out.println(plus);

	}

}
