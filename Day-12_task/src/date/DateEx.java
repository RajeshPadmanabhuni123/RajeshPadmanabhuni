/*
 * @author rajesh
 */
package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date =new Date();//date constructor
		
		System.out.println(date.toString());
		
		LocalDateTime currentTime=LocalDateTime.now();
		
		
		LocalDate date1= currentTime.toLocalDate();
		System.out.println(date1);
		Month month=currentTime.getMonth();
		int day=currentTime.getDayOfMonth();
		int seconds=currentTime.getSecond();
		System.out.println(month+" "+day+" "+seconds);
		
		ZoneId id=ZoneId.of("Europe/Paris");
		System.out.println(id);
		
		ZoneId currentZone=ZoneId.systemDefault();
		System.out.println(currentZone);
		LocalDate date2= LocalDate.now();
		System.out.println(date2);
		
		LocalDate date3= date2.plus(1,ChronoUnit.MONTHS);
		System.out.println(date2);
		
		Period period=Period.between(date2, date3);
		System.out.println(period); //period (diff)
		
		
		
	}

}
