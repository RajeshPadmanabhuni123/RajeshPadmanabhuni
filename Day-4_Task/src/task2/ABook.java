package task2;
import java.util.Scanner;
public class ABook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the option");
		System.out.println("1. Regular Book");
		System.out.println("2. Reference Book");
		System.out.println("3. Audio Book");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				Book b=new Book();
				System.out.println("Enter the title");
				b.title=sc.next();
				System.out.println("Enter author name");
				b.author=sc.next();
				System.out.println("Enter the Day taken");
				b.dayTaken=sc.nextInt();
				System.out.println("Enter the todayDate(should be greater than dayTaken");
				int day=sc.nextInt();
				b.daysOverdue(day);
				b.Overdue(day);
				b.computeFine(day);
				break;
			}
			case 2:
			{
				RefBook b=new RefBook();
				System.out.println("Enter the title");
				b.title=sc.next();
				System.out.println("Enter author name");
				b.author=sc.next();
				System.out.println("Enter the Day taken");
				b.dayTaken=sc.nextInt();
				System.out.println("Enter the todayDate(should be greater than dayTaken");
				int day=sc.nextInt();
				b.daysOverdue(day);
				b.Overdue(day);
				b.computeFine(day);
				break;
			}
			case 3:
			{
				AudioBook b=new AudioBook();
				System.out.println("Enter the title");
				b.title=sc.next();
				System.out.println("Enter author name");
				b.author=sc.next();
				System.out.println("Enter the Day taken");
				b.dayTaken=sc.nextInt();
				System.out.println("Enter the todayDate(should be greater than dayTaken");
				int day=sc.nextInt();
				b.daysOverdue(day);
				b.Overdue(day);
				b.computeFine(day);
				break;
			}
		}
	}

}
