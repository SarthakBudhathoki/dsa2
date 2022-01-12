package stack;

public class StackTest {
	int top=-1;
	char stacks [];
	int size;
	
	StackTest(int n){
		this.size=n;
		stacks=new char[n];
	}
	 void push(char data) {
		 
		 if(isFull()) {
			 System.out.println("stack overflow");
		 }
		 else {
			 //top++;
			 
			 stacks[++top]=data;
		 }
	 }
	 char pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 'f';
		}
		else {
//			int temp=top;
//			top--;
			return stacks[top--];
			//top--;
		}
		 
	 }
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
			}
		return false;
		
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	public char peek() {
		return stacks[top];
	}
}
