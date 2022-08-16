import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        int count = 0;
        for(int j = 0; j < arr1.length; j++) {
            int sum = 0;
            for(int k = j; k < arr1.length; k++) {
                sum = arr1[k] + sum;
                if(sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
