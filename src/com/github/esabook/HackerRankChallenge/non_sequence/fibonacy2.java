package com.github.esabook.HackerRankChallenge.non_sequence;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class Result2 {

    /*
     * Complete the 'fibonacci' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> fibonacci(int n) {
        // Write your code here
        List<Integer> f = new ArrayList<>();
        for (int i = 1; i<= n; i++){
            if (i == 1) f.add(0);
            if (i == 2) f.add(1);
            if (i > 2) {
                int next = f.get(f.size()-1) + f.get(f.size() - 2);
                f.add(next);
            }
        }

        return f;
    }

}

public class fibonacy2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result2.fibonacci(n);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
