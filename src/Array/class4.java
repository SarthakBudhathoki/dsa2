package Array;

public class class4 {
	
	int trapWater(int height[]) {
		int ans=0;
		int n=height.length;
		
		for(int i=0;i<n;i++) {
			
			int leftmax=height[i];
			
			for(int j=i-1;j>=0;j--) {
				leftmax=Math.max(leftmax, height[j]);
			}
			int rightmax=height[i];
			
			for(int j=i+1;j<n;j++) {
				rightmax=Math.max(rightmax, height[j]);
			}
			ans=ans+(Math.min(leftmax, rightmax)-height[i]);
		}
		
		
		return ans;
		
	}
	
	public static void main(String [] args) {
		
		class4 c=new class4();
		int height[]= {2,3,1,2,5};
		System.out.println(c.trapWater(height));
	}

}
