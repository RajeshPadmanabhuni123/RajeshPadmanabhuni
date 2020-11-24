package task3;

public class String_Builder
{
	public static void main(String[] args)
	{
		StringBuilder sb1=new StringBuilder("Rajesh ");
		StringBuilder sb2=new StringBuilder(" Padmanabhuni");
		System.out.println(sb1.append(" Rockzz"));
		System.out.println(sb2.append(';'));
		System.out.println(sb2.appendCodePoint(80));
		System.out.println(sb1.delete(6,10));
		System.out.println(sb2.replace(0,1,"RAJESH "));
		System.out.println(sb2.insert(0,"Padmanabhuni "));
		System.out.println(sb2.indexOf("P"));
		System.out.println(sb2.insert(0,"Mr."));
		System.out.println(sb2.lastIndexOf("Rajesh"));
		System.out.println(sb1.reverse());
		System.out.println(sb1.toString());
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(150);
		System.out.println(sb1);
		sb1.trimToSize();
		System.out.println(sb1);
		sb1.setLength(18);
		System.out.println(sb1);
		System.out.println(sb1.charAt(10));
		System.out.println(sb1.codePointAt(3));
		System.out.println(sb1.codePointBefore(3));
		System.out.println(sb1.codePointCount(0, 1));
		System.out.println(sb1.offsetByCodePoints(0, 4));
		sb1.setCharAt(0,'-');
		System.out.println(sb1);
		System.out.println(sb1.substring(4));
		System.out.println(sb1.subSequence(0, 1));

	}
}