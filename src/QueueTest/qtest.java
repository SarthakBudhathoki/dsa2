package QueueTest;

public class qtest {
	
	public static void main(String [] args) {
		queuetest1 q=new queuetest1(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}



