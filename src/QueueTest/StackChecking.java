package QueueTest;

public class StackChecking {
    int top =-1;
    String stackys [];
    int size;
    StackChecking (int n){
        this.size=n;
        stackys =new String[n];
    }
    void push(String data){
        if (isFull()){
            System.out.println("stack overflow");
        }
        else{
            stackys[++top]= data;
        }
    }
    String pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return "thank you";
        }
        else{
            return stackys[top--];
        }

    }
    public boolean isFull(){
        if (top==size-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }
    public  String peek(){
        return stackys[top];
    }


}

