package task1;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
public class Main {
	
    public static void main(String[] args) throws InterruptedException 
        { 
      
            // create object of DelayQueue 
            BlockingQueue<DelayObject> DQ = new DelayQueue<DelayObject>(); 
      
            // Add numbers to end of DelayQueue 
            DQ.add(new DelayObject("A", 2)); 
            DQ.add(new DelayObject("B", 3)); 
            DQ.add(new DelayObject("C", 5)); 
            DQ.add(new DelayObject("D", 1)); 
      
            // Creating an iterator 
            Iterator val = DQ.iterator(); 
      
            // print the value after iterating DelayQueue 
            while (val.hasNext()) { 
                System.out.println("Sell medicine "+val.next()); 
            } 
        } 
}
 