package task3;

import java.util.Scanner;

public class WeightEnum {
	public enum Planets{
		MERCURY(0.378),
		VENUS(0.907),
		MARS(0.377),
		JUPITER(2.528),
		SATURN(1.064),
		URANUS(0.889),
		NEPTUNE(1.125),
		PLUTO(0.067);
		double value;
		Planets(double value) {
			this.value=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight ");
		int weight=sc.nextInt();
		for(Planets s:Planets.values())
		{
			System.out.println("Your weight in "+s+" is "+(s.value)*weight);
		}
		
	}

}
