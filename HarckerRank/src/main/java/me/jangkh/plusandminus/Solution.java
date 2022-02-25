package me.jangkh.plusandminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;

        for(int num: arr) {
            if (num > 0)
                plusCount++;
            else if (num < 0)
                minusCount++;
            else
                zeroCount++;
        }

        System.out.println((float)plusCount / arr.size());
        System.out.println((float)minusCount / arr.size());
        System.out.println((float)zeroCount / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}