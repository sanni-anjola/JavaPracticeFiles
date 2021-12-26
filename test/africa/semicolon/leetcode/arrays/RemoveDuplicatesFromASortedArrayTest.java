package africa.semicolon.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromASortedArrayTest {

    @Test
    void returnCorrectLengthTest(){
        int[] arr = {2, 5, 5, 5, 9, 23, 28};

        int k = RemoveDuplicatesFromASortedArray.solution(arr);

        assertEquals(5, k);
        int[] newArray = new int[k];
        System.arraycopy(arr, 0, newArray,0,k);
        System.out.println(Arrays.toString(newArray));
        assertArrayEquals(new int[]{2,5,9,23,28}, newArray);
    }

}