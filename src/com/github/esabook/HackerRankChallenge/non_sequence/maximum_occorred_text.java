package com.github.esabook.HackerRankChallenge.non_sequence;
import java.io.*;
import java.util.*;

/**
 * Counting largest times repeated char in given text
 */
class Result1 {

    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */

    public static char maximumOccurringCharacter(String text) {
        // Write your code here
        int currentRating = 0;
        char currentChar = '\0';
        Map<Character, Integer> cols = new HashMap<>();
        for (char c: text.toCharArray()){
            if (Character.isAlphabetic(c) || Character.isDigit(c)){
                if (cols.containsKey(c))
                    cols.replace(c, cols.get(c)+1);
                else
                    cols.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> c: cols.entrySet()){
            if (c.getValue() > currentRating) {
                currentRating = c.getValue();
                currentChar =  c.getKey();
            }
        }
        return currentChar;
    }

}
public class maximum_occorred_text {




        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String text = bufferedReader.readLine();

            char result = Result1.maximumOccurringCharacter(text);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();

            System.out.println(String.valueOf(result));
            bufferedReader.close();
//            bufferedWriter.close();
        }
    }
