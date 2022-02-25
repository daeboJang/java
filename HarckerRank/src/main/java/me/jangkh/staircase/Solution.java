package me.jangkh.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    public static void staircase(int n) {
        // Write your code here
        int blank = n - 1;
        for (int i=0; i < n; i++) {
            for (int j=0; j < blank; j++) {
                System.out.print(" ");
            }

            for (int j=0; j < n - blank; j++) {
                System.out.print("#");
            }

            System.out.println("");
            --blank;
        }
    }

    public static void staircase2(int n) {
        String[][] board = new String[n][n];

        for (int i=0; i < n; i++) {

        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
