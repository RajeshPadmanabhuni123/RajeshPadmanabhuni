package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eight");
		hm.put(9, "nine");
		hm.put(10, "ten");
		hm.put(11, "eleven");
		hm.put(12, "twelve");
		hm.put(13, "thirteen");
		hm.put(14, "fourteen");
		hm.put(15, "fifteen");
		hm.put(16, "sixteen");
		hm.put(17, "seventeen");
		hm.put(18, "eighteen");
		hm.put(19, "nighteen");
		hm.put(20, "twenty");

		
		System.out.println("Enter the key to search the value : ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(hm.get(s));
	}
}
