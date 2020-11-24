package Rectangle;
import java.util.Scanner;
public class Rectangle {
	int length;
	int width;
	public Rectangle() {
	
	}
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void area(int length,int width,int depth)
	{
		System.out.println("Area "+depth*length*width);
	}
}
