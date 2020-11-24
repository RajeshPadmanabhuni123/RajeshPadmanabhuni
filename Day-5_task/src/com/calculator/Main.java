package com.calculator;
import java.util.Scanner;
import com.arithmetic.*;
import com.logical.*;
import bitwise.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Logical l=new Logical();
		Arithmetic a=new Arithmetic();
		Bitwise b=new Bitwise();
		int num1,num2;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. modulo division");
		System.out.println("6. greater than");
		System.out.println("7. less than");
		System.out.println("8. greater than equal");
		System.out.println("8. less than equal");
		System.out.println("9. not equal");
		System.out.println("10. bitwise AND");
		System.out.println("11. bitwise OR");
		System.out.println("12. bitwise XOR");
		
		int choice;
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			a.add(num1, num2);
			break;
		}
		case 2:
		{
			a.sub(num1, num2);
			break;
		}
		case 3:
		{
			a.mul(num1, num2);
			break;
		}
		case 4:
		{
			a.div(num1, num2);
			break;
		}
		case 5:
		{
			a.modDiv(num1, num2);
			break;
		}
		case 6:
		{
			l.greaterThan(num1, num2);
			break;
		}
		case 7:
		{
			l.lessThan(num1, num2);
			break;
		}
		case 8:
		{
			l.greaterThanEqual(num1, num2);
			break;
		}
		case 9:
		{
			l.lessThanEqual(num1, num2);
			break;
		}
		case 10:
		{
			l.notEqual(num1, num2);
			break;
		}
		case 11:
		{
			b.and(num1,num2);
			break;
		}
		case 12:
		{
			b.or(num1,num2);
			break;
		}
		case 13:
		{
			b.xor(num1,num2);
			break;
		}
		case 14:
		{
			b.compliment(num1);
			break;
		}
		default:
			System.out.println("Invalid choice !!");
			break;
		}
	}

}
