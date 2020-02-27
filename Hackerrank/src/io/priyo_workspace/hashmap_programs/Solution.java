package io.priyo_workspace.hashmap_programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String,Integer> hm1=new HashMap<String,Integer>();
        for(int i=0;i<magazine.length;i++){
            if(!hm1.containsKey(magazine[i])){
                hm1.put(magazine[i],1);
            }else{
                hm1.put(magazine[i],hm1.get(magazine[i])+1);
            }
        }
        int count=0;
        Map<String,Integer> hm2=new HashMap<String,Integer>();
        for(int i=0;i<note.length;i++){
            if(!hm2.containsKey(note[i])){
                hm2.put(note[i],1);
            }else{
                hm2.put(note[i],hm2.get(note[i])+1);
            }
        }
        for(int j=0;j<note.length;j++){
           if( hm1.get(note[j])== hm2.get(note[j])){
               count++;
           }
        }
        System.out.println(note.length==count?"Yes":"No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
