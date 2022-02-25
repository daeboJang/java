package me.jangkh.diagonalMatrix;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalMatrixTest {
    @Test
    public void test1() {
        List<List<Integer>> sample1 = new ArrayList<>();
        sample1.add(new ArrayList<>(Arrays.asList(1,2,3)));
        sample1.add(new ArrayList<>(Arrays.asList(4,5,6)));
        sample1.add(new ArrayList<>(Arrays.asList(7,8,9)));

        int result = Result.diagonalDifference(sample1);
        assertEquals(0, result);
        System.out.println(sample1);
    }

}