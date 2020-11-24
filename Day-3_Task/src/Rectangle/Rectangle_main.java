package Rectangle;

import java.util.Scanner;

class Rectangle_main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Box r = new Box();
		System.out.println("enter length");
		r.length=sc.nextInt();
		System.out.println("Enter width");
		r.width=sc.nextInt();
		System.out.println("Enter depth");
		r.depth=sc.nextInt();
		
		r.area(r.length, r.width,r.depth);
		
	}
}

