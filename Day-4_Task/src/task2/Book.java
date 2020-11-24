package task2;

public class Book implements IBook{

	String title;
	String author;
	int dayTaken;
	public Book(){
		
	}
	@Override
	public void daysOverdue(int days)
	{
		if(days-this.dayTaken > 14)
		{
			System.out.println("No. of Days Overdue "+(days-this.dayTaken));
		}
		else
			System.out.println("The book can still be out for "+(14-(days-this.dayTaken)));
	}
	@Override
	public void Overdue(int dayReceived) {
		if(dayReceived-this.dayTaken > 14)
			System.out.println("OverDue");
		else
			System.out.println("No Due");
		
	}
	@Override
	public void computeFine(int days) {
		// TODO Auto-generated method stub
		int fine=this.dayTaken-days;
		if(fine>0)
		System.out.println("You have a fine of "+(fine*10)+" days");
		else
			System.out.println("You have no fine ");
	}
	
}
