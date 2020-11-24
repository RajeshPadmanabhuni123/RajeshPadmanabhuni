package task1;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityBlockingQueue pbq=new PriorityBlockingQueue(10, Comparator.reverseOrder());
		pbq.add(1);
		pbq.add(20);
		pbq.add(25);
		
		System.out.println(pbq);
		System.out.println(pbq.poll());
		System.out.println(pbq.poll());
		System.out.println(pbq.poll());

	}
}
