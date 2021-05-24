package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class KataTest {

    private Kata kata;

    @BeforeEach
    void InitializeKataBeforeEachTest(){
        kata = new Kata();
    }

    @Test
    void testThatKataReturnsTrueForThreeDigitPalindrome(){
        boolean res = kata.isPalindrome(989);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForFourDigitPalindrome(){
        boolean res = kata.isPalindrome(9889);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForSingleDigit(){
        boolean res = kata.isPalindrome(9);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForAnyNumberOfDigitPalindrome(){
        boolean res = kata.isPalindrome(712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForPalindromicNegativeNumbers(){
        boolean res = kata.isPalindrome(-712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsFalseForNonPalindromicNumbers(){
        boolean res = kata.isPalindrome(-7126567);
        assertFalse(res);
    }

    @Test
    void testThatWhatGradeIsReturnsAFor90AndAbove(){
        assertEquals('A', kata.getGrade(96));
    }

    @Test
    void testThatWhatGradeIsReturnsBFor80to89(){
        assertEquals('B', kata.getGrade(83));
    }

    @Test
    void testThatWhatGradeIsReturnsCFor70to79(){
        assertEquals('C', kata.getGrade(70));
    }

    @Test
    void testThatWhatGradeIsReturnsDFor60to69(){
        assertEquals('D', kata.getGrade(61));
    }

    @Test
    void testThatWhatGradeIsReturnsFFor59AndBelow(){
        assertEquals('F', kata.getGrade(59));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsZeroForNegativeCopies(){
        assertEquals(0, kata.getTotalAmountForTestDriller(-3));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor4CopiesOrLess(){
        assertEquals(4500, kata.getTotalAmountForTestDriller(3));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor5to9Copies(){
        assertEquals(11200, kata.getTotalAmountForTestDriller(8));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor10to29Copies(){
        assertEquals(25200, kata.getTotalAmountForTestDriller(21));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor50to99Copies(){
        assertEquals(77000, kata.getTotalAmountForTestDriller(77));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor100to199Copies(){
        assertEquals(178200, kata.getTotalAmountForTestDriller(198));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor200CopiesOrAbove(){
        assertEquals(240000, kata.getTotalAmountForTestDriller(300));
    }

    @Test
    void testThatResellersProfitReturnedZeroForNegativeCopies(){
        assertEquals(0, kata.getProfit(-7));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor4CopiesOrLess(){
        assertEquals(1000, kata.getProfit(2));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor5To9Copies(){
        assertEquals(3600, kata.getProfit(6));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor10To29Copies(){
        assertEquals(12000, kata.getProfit(15));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor30To49Copies(){
        assertEquals(36000, kata.getProfit(40));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor50To99Copies(){
        assertEquals(67000, kata.getProfit(67));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor100To199Copies(){
        assertEquals(211200, kata.getProfit(192));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor200CopiesAndAbove(){
        assertEquals(620400, kata.getProfit(517));
    }

    @Test
    void testThatComputeNumberOfFactorsReturns4For10(){
        assertEquals(1, kata.computeNumberOfFactors(1));
        assertEquals(2, kata.computeNumberOfFactors(2));
        assertEquals(4, kata.computeNumberOfFactors(10));
        assertEquals(6, kata.computeNumberOfFactors(20));
        assertEquals(3, kata.computeNumberOfFactors(25));
        assertEquals(9, kata.computeNumberOfFactors(100));
    }

    @Test
    void testThatComputeNumberOfFactorsReturnsZeroForNumbersLessThanOrEqualToZero(){
        assertEquals(0, kata.computeNumberOfFactors(0));
        assertEquals(0, kata.computeNumberOfFactors(-15));
    }
}
