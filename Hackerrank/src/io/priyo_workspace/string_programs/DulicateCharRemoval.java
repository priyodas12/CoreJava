package io.priyo_workspace.string_programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DulicateCharRemoval {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	
    	int result=0;
    	//count from 1
    	for (int i = 0; i < (s.length() - 1); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) 
                result++;    
    	}
        return result; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
