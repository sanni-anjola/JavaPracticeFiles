package africa.semicolon.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void testTwoSum(){
        //given
        int[] array = {2, 7, 11, 15};
//        int target = 9;
        int target = 91;
        //when
        int[] actual = TwoSum.solution(array, target);
//        int[] expected = {0, 1};
        int[] expected = null;
        //assert

        assertArrayEquals(expected, actual);
    }


    @Test
    void testTwoSumMap(){
        //given
        int[] array = {2, 7, 11, 15};
        int target = 9;
//        int target = 91;
        //when
        int[] actual = TwoSum.solutionMap(array, target);
        int[] expected = {0, 1};
//        int[] expected = null;
        //assert

        assertArrayEquals(expected, actual);
    }

    @Test
    void test1(){
        assertEquals("j-lh-gFE=dcba!!", TwoSum.loveProblem("a-bc-dEF=ghlj!!"));
    }
}