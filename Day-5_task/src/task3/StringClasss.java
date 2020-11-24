package task3;

public class StringClasss
{
    public static void main(String[] args)
    {
        String str=new String("Rajesh");
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(3));
        System.out.println(str.codePointAt(4));
        System.out.println(str.codePointBefore(2));
        System.out.println(str.codePointCount(0, 3));
        System.out.println(str.offsetByCodePoints(1, 3));
        char[] dst=new char[9];
        str.getChars(0, 3, dst, 0);
        System.out.println(dst);
        System.out.println(str.getBytes());
        System.out.println(str.equals("Rajesh"));
        StringBuffer sb=new StringBuffer("Rajesh");
        System.out.println(str.contentEquals(sb));
        System.out.println(str.equalsIgnoreCase("RaJESh"));
        System.out.println(str.compareTo("Rajesh"));
        System.out.println(str.compareToIgnoreCase("rAJesh"));
        System.out.println(str.regionMatches(0, "Raj", 0, 3));
        System.out.println(str.startsWith("Ra"));
        System.out.println(str.endsWith("sh"));
        System.out.println(str.indexOf("esh"));
        System.out.println(str.lastIndexOf("s"));
        System.out.println(str.substring(0,3));
        System.out.println(str.subSequence(0, 3));
        System.out.println(str=str.concat(" padmanabhuni"));
        System.out.println(str=str.replace("p", "P"));
        System.out.println(str=str.replaceFirst("Padmanabhuni", "Roxta"));
        System.out.println(str.replaceAll("Roxta", "Padmanabhuni"));
        String[] strArr=str.split(" ");
        for(String i:strArr)
        System.out.println(i);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str="       "+str+"        ");
        System.out.println(str=str.trim());
        System.out.println(str.toString());
        System.out.println(str.toCharArray());
        System.out.println(String.format("%200s", str));
        System.out.println(str.valueOf('R'));
        char[] data= {' ','H','C','L'};
        System.out.println(str.copyValueOf(data));
        System.out.println(str.intern());    
    }

 

}
 