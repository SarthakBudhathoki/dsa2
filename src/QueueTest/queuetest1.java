package QueueTest;

public class queuetest1 {
	int front;
	int rear;
	int size;
	int queue[];
	
	queuetest1(int n){
		this.front=-1;
		this.rear=-1;
		this.size=n;
		queue=new int[n];
	}
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue Overflow");
		}
		else {
			if(isEmpty()) {
				front++;
			}
			queue[++rear]=data;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is underflow.");
			return -9999;
		
		}
		else {
			int element=queue[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
			}
			return element;
		}
	}
	
	public boolean isFull() {
		return rear==size-1;
		
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	

}
