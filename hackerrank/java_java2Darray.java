import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        System.out.println(maxHourglass(arr));
    }
    
    public static int maxHourglass(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                int sum = arraySum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    
    public static int arraySum(List<List<Integer>> arr, int i, int j) {
        
        int arraySum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
        return arraySum;
    }
}