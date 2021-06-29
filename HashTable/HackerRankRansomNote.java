package HashTable;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        int wordCount = note.length;
        
        Hashtable<String, Integer> ht = new Hashtable<String , Integer>();
        
        // Iterate over the magazine words and put them into ht HashTable.
        // If a word is already exits, it will increase its key by one.
         for (int i = 0 ; i<magazine.length; i++) {
            String key = magazine[i];
            Integer count = 1;
          
           if(ht.containsKey(key)) {
               count = ht.get(key) + 1;
           }           
            ht.put(key, count);
         }
        
         for (int i = 0 ; i<note.length; i++) {
            String key = note[i];
                      
           if(ht.containsKey(key)) {
               wordCount--;
               Integer count = ht.get(key) - 1;
               if (count == 0){
                ht.remove(key);
               }
               else ht.put(key,count);
           }           
    
        }
    if (wordCount == 0) System.out.println("Yes");
    else System.out.println("No");

    
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
