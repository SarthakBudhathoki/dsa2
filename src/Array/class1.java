package Array;

public class class1 {
	public static int main(int[] args) {
    int a[] = new int[5];  // a [] = {10,20,30,40,50}
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
    
    insertatAnyPos(int a[], int n, int Pos,int data){
   
    int x[] new int[n+1];
    for (int i = 0; i<n+1; i++) {
    	if (i<Pos-1) {
    		x[i]= a[i];
    	}
    	else if (i == Pos) {
    		x[i] = data;
    	}
    	else {
    		x[i] = a[i-1];
    	}
    	
    }
    
    }
    return x;
	}
}
