package com.github.esabook.HackerRankChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * Java Loops II
 *
 * We use the integers , , and  to create the following series:
 *
 * You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
 *
 * Input Format
 *
 * The first line contains an integer, , denoting the number of queries.
 * Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
 *
 * Constraints
 *
 * Output Format
 *
 * For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
 *
 * Sample Input
 *
 * 2
 * 0 2 10
 * 5 3 5
 * Sample Output
 *
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 */
public class no5_Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String s = "";
            for (int r = 1; r <= n; r++){

                int currentSeries = 0;
                for (int sr=0; sr<r; sr++){
                    currentSeries += (b * Math.pow(2, sr));
                }
                s += String.format(" %d", a + currentSeries);
            }
            s = s.replaceFirst(" ","");
            System.out.println(s);
        }
        in.close();
    }
}
