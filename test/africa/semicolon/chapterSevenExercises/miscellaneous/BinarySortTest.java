package africa.semicolon.chapterSevenExercises.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySortTest {

    @Test
    void canSortArray_usingBinarySort(){
        // given
        int[] arr = {5,3,4,2,1,6};
        int[] arr2 = {10, 2, 0, 1, 5, 2};

        // when
        BinarySort.sort(arr);
        BinarySort.sort(arr2);

        // assert
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
        assertArrayEquals(new int[]{0, 1, 2, 2, 5, 10}, arr2);
    }

}