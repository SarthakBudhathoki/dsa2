package QueueTest;

public class CircularQueue {
	int front;
	int rear;
	int size;
	int queue[];
	
	CircularQueue(int n){
		front=rear=-1;
		size=n;
		queue= new int[n];
		
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue overflow");
		}
		else {
			
			if(isEmpty()) {
				front =rear=0;
				queue[rear]=data;
			}
			else {
				rear=(rear+1)%size;
				queue[rear]=data;
			}
			
		}
		
		
	}
	
	public int dequeue() {
		
		int temp=front;
		if(isEmpty()) {
			System.out.println("queue underflow");
			return -999;
		}
		else {
			if(front ==rear) {
				front=rear=-1;
			}
			else {
				front=(front+1)%size;
			}
			
			return queue[temp];

		}
	}
	
	public boolean isEmpty() {
		return front ==-1 && rear==-1;
	}
	
	public boolean isFull() {
		return (rear+1)%size==front;
	}

}
