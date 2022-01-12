package Array;

import java.util.scanner;


public class class2 {
	
	public class Replace{
		public int[] insertAtAnyPosition(int[] myArray,int n, int pos, int data) {
			int newarr[] new int[n+1];
		    for (int i=0; i<n+1;i++) {
		    	if (i<pos-1) {
		    		newarr[i] = myarr[i];
		    	}
		    	else if (i==pos-1) {
		    		newarr[i] = data;
		    	}
		    	else {
		    		newarr = myArr[i-1];
		    	}
		    }
		    return newarr;
		}
	}
	public static void main(String[]Args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		System.out.println("printing onld data");
		for (int i=o; i<a.length;i++) {
			System.out.println(a[i]);
		}
		replace r = new Replace();
		r.insertAtAnyPosition(a,a.length, pos, data); //(a,5,3,25)
		
		System.out.println("printing new data");
		for (int i=o; i<a.length;i++) {
			System.out.println(x[i]);
		}

	}

}
