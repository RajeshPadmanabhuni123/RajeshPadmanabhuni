package task1;

public class ThreadClass {

	public static void main(String[] args) {
			
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		//System.out.println(t1.activeCount());
		t1.checkAccess();
		Thread1 t3=(Thread1)t1.clone();
		System.out.println(Thread1.currentThread());
		//t1.dumpStack();
		System.out.println(t1.isAlive());
		System.out.println(Thread.currentThread());
		t1.setName("Rajesh");
		t1.setPriority(10);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000,300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		t3.yield();
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(Thread.holdsLock(t1));
		t1.interrupt();
		System.out.println(t1.interrupted());
		System.out.println(t1.isAlive());
		System.out.println(t1.isDaemon());
		System.out.println(t1.isInterrupted());
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.run();
		t2.setDaemon(true);

		t1.stop();
		//t2.destroy();
	}
	
}
