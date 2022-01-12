package Array;

import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int[] x = {8, 4, 1, 1, 2,2, 2};
        int target = 2;
        Arrays.sort(x);   //cannot use sort directly
        System.out.println();
        for (int i =0; i<x.length;i++){
            if (x[i]==target){
                System.out.println(i+1);
            }
        }
        System.out.println("3,4,5");
    }
}
