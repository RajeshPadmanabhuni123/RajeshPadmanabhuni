/**
 * @Basic Lambdas
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */

package task4;

import java.util.Arrays;

public class BasicLamdas implements Task4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Raju","rajesh","Vigni","Keerthi","Anu"};
		//sort by length
		Task4 t=(a)->{
			String[] b=a;
			Arrays.sort(b,(str1,str2)->str1.length()-str2.length());
			System.out.println(Arrays.asList(b));
		};
		t.compare(s);
		//sort by reverse length
		t=(a)->{
			String[] b=a;
			for(int i=1;i<b.length;i++)
			{
				String temp=s[i];
				
				int j=i-1;
				while(j>=0 && (temp.length() > s[j].length()))
				{
					s[j+1]=s[j];
					j--;
				}
				s[j+1]=temp;
			}
			System.out.println(Arrays.asList(b));
		};
		t.compare(s);
		//sort by alphabetically
		t=(a)->{
			String[] b=a;
			Arrays.sort(b,(str1,str2)->str1.charAt(0)-str2.charAt(0));
			System.out.println(Arrays.asList(b));
		};
		t.compare(s);
		//sort by contain character e
		t=(a)->{
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i].contains("e") || a[i].contains("E"))
					System.out.print(a[i]+", ");
			}
			for(int i=0;i<a.length;i++)
			{
				if(!a[i].contains("e") && !a[i].contains("E"))
					System.out.print(a[i]+", ");
			}
			System.out.println();
		};
		t.compare(s);
		//sort by contain character e by using static method
			Task4.method(s, 1);
			Task4.method(s, 0);
		
	}

	@Override
	public void compare(String[] s) {
		// TODO Auto-generated method stub
		
	}
}

