package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class KataTest {

    @Test
    void testThatKataReturnsTrueForThreeDigitPalindrome(){
        boolean res = Kata.isPalindrome(989);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForFourDigitPalindrome(){
        boolean res = Kata.isPalindrome(9889);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForSingleDigit(){
        boolean res = Kata.isPalindrome(9);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForAnyNumberOfDigitPalindrome(){
        boolean res = Kata.isPalindrome(712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForPalindromicNegativeNumbers(){
        boolean res = Kata.isPalindrome(-712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsFalseForNonPalindromicNumbers(){
        boolean res = Kata.isPalindrome(-7126567);
        assertFalse(res);
    }

    @Test
    void testThatWhatGradeIsReturnsAFor90AndAbove(){
        assertEquals('A', Kata.getGrade(96));
    }

    @Test
    void testThatWhatGradeIsReturnsBFor80to89(){
        assertEquals('B', Kata.getGrade(83));
    }

    @Test
    void testThatWhatGradeIsReturnsCFor70to79(){
        assertEquals('C', Kata.getGrade(70));
    }

    @Test
    void testThatWhatGradeIsReturnsDFor60to69(){
        assertEquals('D', Kata.getGrade(61));
    }

    @Test
    void testThatWhatGradeIsReturnsFFor59AndBelow(){
        assertEquals('F', Kata.getGrade(59));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsZeroForNegativeCopies(){
        assertEquals(0, Kata.getTotalAmountForTestDriller(-3));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor4CopiesOrLess(){
        assertEquals(4500, Kata.getTotalAmountForTestDriller(3));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor5to9Copies(){
        assertEquals(11200, Kata.getTotalAmountForTestDriller(8));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor10to29Copies(){
        assertEquals(25200, Kata.getTotalAmountForTestDriller(21));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor50to99Copies(){
        assertEquals(77000, Kata.getTotalAmountForTestDriller(77));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor100to199Copies(){
        assertEquals(178200, Kata.getTotalAmountForTestDriller(198));
    }

    @Test
    void testThatTotalAmountForTestDrillerReturnsThePriceFor200CopiesOrAbove(){
        assertEquals(240000, Kata.getTotalAmountForTestDriller(300));
    }

    @Test
    void testThatResellersProfitReturnedZeroForNegativeCopies(){
        assertEquals(0, Kata.getProfit(-7));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor4CopiesOrLess(){
        assertEquals(1000, Kata.getProfit(2));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor5To9Copies(){
        assertEquals(3600, Kata.getProfit(6));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor10To29Copies(){
        assertEquals(12000, Kata.getProfit(15));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor30To49Copies(){
        assertEquals(36000, Kata.getProfit(40));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor50To99Copies(){
        assertEquals(67000, Kata.getProfit(67));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor100To199Copies(){
        assertEquals(211200, Kata.getProfit(192));
    }

    @Test
    void testThatResellersProfitReturnedIsCorrectFor200CopiesAndAbove(){
        assertEquals(620400, Kata.getProfit(517));
    }

    @Test
    void testThatComputeNumberOfFactorsReturns4For10(){
        assertEquals(1, Kata.computeNumberOfFactors(1));
        assertEquals(2, Kata.computeNumberOfFactors(2));
        assertEquals(4, Kata.computeNumberOfFactors(10));
        assertEquals(6, Kata.computeNumberOfFactors(20));
        assertEquals(3, Kata.computeNumberOfFactors(25));
        assertEquals(9, Kata.computeNumberOfFactors(100));
    }

    @Test
    void testThatComputeNumberOfFactorsReturnsZeroForNumbersLessThanOrEqualToZero(){
        assertEquals(0, Kata.computeNumberOfFactors(0));
        assertEquals(0, Kata.computeNumberOfFactors(-15));
    }

    @Test
    void testThatReverseNumberDoesWhatItSays(){
        assertEquals("54321", Kata.reverseNumber(12345));
    }

    @Test
    void testThatFindFactorialOfReturnsFactorialOfAGivenNumber(){

        assertEquals(120, Kata.findFactorialOf(5));
        assertEquals(720, Kata.findFactorialOf(6));
    }

    @Test
    void testThatFindFactorialOfReturnsOneFactorialOfAZeroOrNegativeNumber(){

        assertEquals(1, Kata.findFactorialOf(-5));
        assertEquals(1, Kata.findFactorialOf(0));
    }

    @Test
    void testThatDecimalToBinaryWorks(){
        assertEquals("101", Kata.decimalToAnyBase(5, 2));
        assertEquals("1101", Kata.decimalToAnyBase(13, 2));
    }

    @Test
    void testThatFindMaximumFromReturnsTheMaxOfAnArray(){
        assertEquals(9, Kata.findMaximumFrom(new int[]{1,3,2,9,6,5,8}));
    }

    @Test
    void testThatFindMinimumFromReturnsTheMaxOfAnArray(){
        assertEquals(-6, Kata.findMinimumFrom(new int[]{1,3,2,9,-6,5,8}));
    }

    @Test
    void testThatFindAverageOfReturnsTheMaxOfAnArray(){
        assertEquals(5.0, Kata.findAverageOf(new int[]{1,3,7,2,9,6,5,8,4,5}), 0.01);
    }
}
