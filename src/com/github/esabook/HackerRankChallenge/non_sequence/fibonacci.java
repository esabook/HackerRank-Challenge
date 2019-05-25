package com.github.esabook.HackerRankChallenge.non_sequence;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int n) {
            int[] fbnc = new int[2];
            fbnc[0] = 0; fbnc[1] = 1;
            for (int i = 2; i <= n; ++i) {
                fbnc[i % 2] = fbnc[0] + fbnc[1];
            }
            return fbnc[n % 2];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}

