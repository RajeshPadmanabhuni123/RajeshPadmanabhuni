package task2;

public class AudioBook implements IBook{

	String title;
	String author;
	int dayTaken;
	public AudioBook()
	{
		
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
	public void computeFine(int duedays) {
		// TODO Auto-generated method stub
		int fine=duedays*20;
		System.out.println("You have a fine of "+fine+" days");
	}
}
