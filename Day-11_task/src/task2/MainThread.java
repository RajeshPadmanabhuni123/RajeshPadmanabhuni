/**
 * @Thread-Main
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */
package task2;

public class MainThread {

	public static void main(String[] args) {
		//running thread
		new Thread(()->{	System.out.println("Running");	},"Rajesh").start();  //running thread and giving name to it
		
	}
}
