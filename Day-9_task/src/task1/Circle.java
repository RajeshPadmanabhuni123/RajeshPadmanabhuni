package task1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=Math.random();
		List<Double> circle=new ArrayList<Double>();;
		while(radius>0.01)
		{
			double area=radius*radius*Math.PI;
			circle.add(area);
			radius=Math.random();
		}
		Iterator<Double>it =circle.iterator();	
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
	}

}
