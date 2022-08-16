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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    
    boolean[] checkPoint = new boolean[4];
        
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch))
            checkPoint[0] = true;
            
            else if(Character.isLowerCase(ch))
            checkPoint[1] = true;
            
            else if(Character.isDigit(ch))
            checkPoint[2] = true;
            
            else
            checkPoint[3] = true;
        }
        int count = 0;
        for(int i=0; i<4; i++){
            if(checkPoint[i]==false)
            count++;
        }
        if(n<6 && n+count<6){
            return (6-n);
        }
        else
        return count;
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
