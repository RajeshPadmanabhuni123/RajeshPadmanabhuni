package task8;

public interface TwoStringPredicateEx {
	public String betterString(String str1,String str2);
	public static void display()
	{
		System.out.println("better String ");
	}

}

interface TwoElementPredicateEx {
	public Object betterElement(Object c1,Object c2);
	
	public static void display()
	{
		System.out.println("better element ");
	}
}