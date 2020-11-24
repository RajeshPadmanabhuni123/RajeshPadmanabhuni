package task5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.9);
		al.add("Shiva");
		al.add("Shiva");
		al.add(30);
		al.add(30.9);
		al.add("Shravya");
		al.add("Sivani");
		al.add(20);
		al.add(5210);
		al.add(60);
		al.add(120);
		al.add(220);
		al.add(290);
		al.add(150);
		al.add(1990);
		long start=System.nanoTime();
		System.out.println(al.get(8));
		long end=System.nanoTime();
		float sec=(end-start)/1000F;
		System.out.println(sec);
		/*Iterator it=al.iterator();//Iterator
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		*/

	}

}

