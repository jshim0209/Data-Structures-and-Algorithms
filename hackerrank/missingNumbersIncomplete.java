import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
        List<Integer> crr = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        
        while(i < arr.size() && j < brr.size()) {
            for(int i = 0; i < arr.size(); i++)
        }
        
        for(int i = 0; i < arr.size(); i++) {
            
        }

    }
    
    static void mergeSort(List<Integer> crr) {
        int length = crr.size();
        
        if(length < 2) {
            return;
        }
        
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        
        for(int i = 0; i < arr.size(); i++) {
            arr.get(i) = crr.get(k);
        }
        for(int j = 0; j < brr.size(); j++) {
            brr.get(j) = crr.get(k);
        }
        
        mergeSort(arr);
        mergeSort(brr);
        
        merge(crr, arr, brr);
               
    }
    
    static void merge(List<Integer> crr, List<Integer> arr, List<Integer> brr) {
        int aSize = arr.size();
        int bSize = brr.size();
        
        int i = 0, j = 0, k = 0;
        
        while(i < aSize && j < bSize) {
            if(arr.get(i) <= brr.get(j)) {
                crr.get(k) = arr.get(i);
                i++;
            } else {
                crr.get(k) = brr.get(j);
                j++;
            }
            k++;
        }
        
        while(i < aSize) {
            crr.get(k) = arr.get(i);
            i++;
            k++;
        }
        
        while(j < bSize) {
            crr.get(k) = brr.get(j);
            j++;
            k++;
        }
    }
    
    static void printArray(List<Integer> crr) {
        for(Integer element : crr) {
            System.out.print(element + " ");
        }
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
