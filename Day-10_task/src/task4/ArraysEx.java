package task4;

import java.util.Arrays;



public class ArraysEx {
	
    public static void main(String[] args) 
    {
        int[] array=new int[10];
        for(int i=0;i<10;i++)
        {
            array[i]=i+5;
        }
        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, 1,6,5));
        int[] array2=new int[10];
        for(int i=0;i<10;i++)
        {
            array2[i]=i+5*i;
        }
       
        System.out.println(Arrays.equals(array,array2));
        String[] strArray=new String[9];
        Arrays.fill(strArray, "Rajesh");
        for(int i=0;i<strArray.length;i++)
        	System.out.print(strArray[i]+" ");
        System.out.println();
        Arrays.fill(strArray,5,7,"RajeshRockzz");
        for(int i=0;i<strArray.length;i++)
        	System.out.print(strArray[i]+" ");
        System.out.println();
        String[] strArray2;
        strArray2=Arrays.copyOf(strArray, 6);
        for(int i=0;i<strArray2.length;i++)
        	System.out.print(strArray2[i]+" ");
        System.out.println();
        char[] charArray= {'w','r','8','3','f'};
        System.out.println(Arrays.copyOfRange(charArray, 0, 2));
        System.out.println(Arrays.copyOfRange(strArray, 0, 2));
        System.out.println(Arrays.hashCode(array));
        System.out.println(Arrays.hashCode(charArray));
        System.out.println(Arrays.deepHashCode(strArray));
        System.out.println(Arrays.deepEquals(strArray, strArray2));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(strArray));
        int[] array3=new int[10];
        Arrays.setAll(array3, (index) -> 1 + index);
        for(int i=0;i<array3.length;i++)
        	System.out.print(array3[i]+" ");
        System.out.println();
        int[] array4=new int[8];
        Arrays.parallelSetAll(array4, (index) -> 1 + index);
        Arrays.stream(array);
        for(int i=0;i<array4.length;i++)
        	System.out.print(array3[i]+" ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

 

}