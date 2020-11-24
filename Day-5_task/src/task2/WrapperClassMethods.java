package task2;
/**
 * @File consisting of Pre-methods of Integer,character and Boolean classes
 * @author - Rajesh Padmanabhuni
 */
import java.util.Scanner;
import java.lang.*;
public class WrapperClassMethods {

	public static void main(String[] args) {
		int a=1000,b=200;
		Integer i1=new Integer("100");
		Integer i2=new Integer("100");
		
		//Integer-Methods
		System.out.println("Bit Count "+Integer.bitCount(a));
		int des=Integer.compare(a, b);
		if(des<0)
		{
			System.out.println("a<b");
		}
		else if(des>0)
			System.out.println("a>b");
		else
			System.out.println("a=b");
		
		des=i1.compareTo(i2);
		if(des<0)
		{
			System.out.println("a<b");
		}
		else if(des>0)
			System.out.println("a>b");
		else
			System.out.println("a=b");
		System.out.println(i1.byteValue());
		des=Integer.compareUnsigned(a, b);
		if(des<0)
		{
			System.out.println("a<b");
		}
		else if(des>0)
			System.out.println("a>b");
		else
			System.out.println("a=b");
		String s1= new String("1234");
		String s2="Rajesh";
		System.out.println("decoded "+Integer.decode(s1));
		System.out.println("Divide "+Integer.divideUnsigned(a,b));
		System.out.println("Return double "+i1.doubleValue());
		System.out.println("compare object "+i1.equals(i2));
		System.out.println("Return float "+i1.floatValue());
		System.out.println(i1.hashCode());
		System.out.println(Integer.hashCode(a));
		System.out.println(Integer.highestOneBit(a));
		int d=i1.intValue();
		System.out.println(d);
		long d1=i1.longValue();
		System.out.println(d1);
		System.out.println(Integer.lowestOneBit(a));
		System.out.println("max "+Integer.max(a, b));
		System.out.println("min "+Integer.min(a, b));
		System.out.println(Integer.numberOfLeadingZeros(a));
		System.out.println(Integer.numberOfTrailingZeros(a));
		System.out.println(Integer.parseInt("1234"));
		System.out.println(Integer.parseInt("FF",16));
		System.out.println(Integer.parseUnsignedInt("1234"));
		System.out.println(Integer.remainderUnsigned(a, b));
		int z=10;

		System.out.println(Integer.reverse(z));
		System.out.println(Integer.reverseBytes(z));
		System.out.println(Integer.rotateRight(z,1));
		short s5=i1.shortValue();
		System.out.println(s5);
		System.out.println(Integer.signum(a));
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toString(a));
		System.out.println(i1.toString());
		System.out.println(Integer.toString(a));
		System.out.println(Integer.parseInt("-FF", 16));
		
		//Character class-Methods
		String z1="Rajesh";
		Character z2=new Character('R');
		Character z3=new Character('R');
		int code=0x12456;
		char x='A';
		char y='B';
		System.out.println(Character.charCount(code));
		System.out.println(z2.charValue());
		System.out.println(Character.compare(x, y));
		System.out.println(z3.equals(z2));
		int w=9;
		System.out.println(Character.forDigit(w, 10));
		System.out.println(Character.getDirectionality(w));
		System.out.println(Character.getName(20));
		System.out.println(Character.getNumericValue(w));
		System.out.println(Character.getNumericValue(20));
		System.out.println(Character.getType(w));
		System.out.println(Character.getType(20));
		System.out.println(z3.hashCode());
		System.out.println(Character.hashCode(z2));
		System.out.println(Character.highSurrogate(20));
		System.out.println(Character.isAlphabetic(90));
		System.out.println(Character.isDefined(w));
		System.out.println(Character.isDefined(90));
		System.out.println(Character.isDigit(w));
		System.out.println(Character.isHighSurrogate(z3));
		System.out.println(Character.isIdentifierIgnorable(z2));
		System.out.println(Character.isIdentifierIgnorable(w));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isMirrored('A'));
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isSupplementaryCodePoint(20));
		System.out.println(Character.isSurrogate(z3));
		System.out.println(Character.isTitleCase(z3));
		System.out.println(Character.isUnicodeIdentifierPart(90));
		System.out.println(Character.isUnicodeIdentifierStart(z3));
		System.out.println(Character.isUpperCase(z3));
		System.out.println(Character.isWhitespace(z3));
		System.out.println(Character.reverseBytes(z3));
		System.out.println(Character.toChars(98));
		System.out.println(Character.toString(z3));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase(98));
		System.out.println(Character.valueOf('a'));

		//BooleanClass
		
		System.out.println(Boolean.parseBoolean("true"));
        Boolean b1=true;
        Boolean b2=false;
        System.out.println(b1.booleanValue());
        System.out.println(Boolean.toString(true));  
        System.out.println(Boolean.hashCode(b1));
        System.out.println(b1.equals(b2));
        System.out.println(Boolean.getBoolean("false"));
        System.out.println(b1.compareTo(b2));
        System.out.println(Boolean.compare(b1, b2)); 
	}
}
