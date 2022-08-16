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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
        Map<Character, Integer> freqMap = new HashMap<>();
                
        for(int i = 0; i < s.length(); i++) {
            if(freqMap.containsKey(s.charAt(i))) {
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i)) + 1);
            } else {
                freqMap.put(s.charAt(i), 1);
            }
        }
        
        Set<Integer> freqSet = new HashSet<>(freqMap.values());
        
        System.out.println(freqSet);
        
        
        
        List<Integer> freq = new ArrayList<>();
        freq.addAll(freqMap.values());
        
        System.out.println(freq);
        
        for(int i = 1; i < freq.size(); i++) {
            if(freq.get(i) != freq.get(0)) {
                return "NO";
            }
            else if(freq.get(i) + 1 != freq.get(0) || freq.get(i) != freq.get(0) + 1) {
                return "NO";
            }
        }
        return "YES";        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
