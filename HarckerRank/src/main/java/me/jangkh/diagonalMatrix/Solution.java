package me.jangkh.diagonalMatrix;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int result;
        int MATRIX_SIZE = arr.size();

        /*int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        for (int i=0; i < MATRIX_SIZE; i++) {
            List<Integer> list = arr.get(i);
            for (int j=0; j < list.size(); j++) {
                matrix[i][j] = list.get(j);
            }
        }*/

        int[][] matrix = toIntArray(arr);

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i=0; i < MATRIX_SIZE; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][MATRIX_SIZE - 1 - i];
        }
        System.out.println(Arrays.deepToString(matrix));

        result = Math.abs(leftDiagonalSum - rightDiagonalSum);
    	return result;
    }

    private static int[][] toIntArray(List<List<Integer>> arr) {
        // stream 을 이용하여 list of lists -> 2d array 로 변환
        return  arr.stream()
                .map(l -> l.stream().mapToInt(i->i).toArray())
                .toArray(int[][]::new);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileDescriptor.out));

        System.out.println("Input:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
