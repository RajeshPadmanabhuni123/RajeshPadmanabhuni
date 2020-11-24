/**
 * @TreeSet using mycomparator
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */
package task3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*MyComparator c=(o1,o2)->{
			Integer i=(Integer)o1;
			Integer j=(Integer)o1;
			if(i<j)
				return 1;
			else
				return -1;
		};*/
		
		//mycomparator using lambda
		TreeSet<Integer> ts= new TreeSet<Integer>((o1,o2)->{
			Integer i=(Integer)o1;
			Integer j=(Integer)o1;
			if(i<j)
				return 1;
			else
				return -1;
		}
				);
		ts.add(67);
		ts.add(63);
		ts.add(55);
		ts.add(0);
		ts.add(100);
		ts.add(2);
		System.out.println(ts);
	}

}
