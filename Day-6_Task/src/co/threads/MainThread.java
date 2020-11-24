package co.threads;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();//thread 1 born stage
		Thread2 t2=new Thread2();//thread 2 born stage
		
		Runnable1 r1=new Runnable1();//general object
		Thread t3=new Thread(r1);//thread 3 born stage
		Runnable2 r2=new Runnable2();//general object
		Thread t4=new Thread(r2);//thread 3 born stage
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
