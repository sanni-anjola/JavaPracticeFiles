package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KataTest {

    @Test
    void testThatKataReturnsTrueForThreeDigitPalindrome(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(989);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForFourDigitPalindrome(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(9889);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForSingleDigit(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(9);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForAnyNumberOfDigitPalindrome(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsTrueForPalindromicNegativeNumbers(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(-712656217);
        assertTrue(res);
    }

    @Test
    void testThatKataReturnsFalseForNonPalindromicNumbers(){
        Kata kata = new Kata();

        boolean res = kata.isPalindrome(-7126567);
        assertFalse(res);
    }
}
