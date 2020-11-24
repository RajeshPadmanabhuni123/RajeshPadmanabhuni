/**
 * @ForEach method Example
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */
package task5;

import java.util.TreeSet;

public class TreesetForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add("Rajesh");
		t.add("virat");
		t.add("Gayle");
		t.add("Abd");
		
		t.forEach((s)->System.out.println(s)); //forEach method to print TreeSet
	}
}
