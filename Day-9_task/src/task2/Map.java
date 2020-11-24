package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
		hm.put("a1234", "SteveJobs");
		hm.put("a1235", "Scott McNealy");
		hm.put("a1236", "Jeff Bezos");
		hm.put("a1237", "Larry Ellison");
		hm.put("a1238", "Bill Gates");
		
		System.out.println("Enter the key to search the value : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(hm.get(s));
	}

}
