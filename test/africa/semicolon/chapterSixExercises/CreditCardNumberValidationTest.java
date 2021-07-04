package africa.semicolon.chapterSixExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberValidationTest {
    @Test
    void canGetTheLength_whenGivenANumber(){
        int size = CreditCardNumberValidation.getSize(4388576018402626L);
        assertEquals(16, size);

        size = CreditCardNumberValidation.getSize(4386018402626L);
        assertEquals(13, size);
    }

    @Test
    void canGetASingleDigit_afterDoublingANumber(){
        int singleDigit = CreditCardNumberValidation.getDigit(8);
        assertEquals(7, singleDigit);

        singleDigit = CreditCardNumberValidation.getDigit(3);
        assertEquals(6, singleDigit);
    }

    @Test
    void canGetTheFirstKNumbers_inAGivenNumber(){
        int prefix = CreditCardNumberValidation.getPrefix(4388576018402626L, 1);
        assertEquals(4, prefix);

        prefix = CreditCardNumberValidation.getPrefix(4386018402626L, 2);
        assertEquals(43, prefix);

        prefix = CreditCardNumberValidation.getPrefix(4386018402626L, 5);
        assertEquals(43860, prefix);
    }

    @Test
    void canCompareNumberPrefix_withCreditCardPrefix(){
        boolean isMatch = CreditCardNumberValidation.prefixMatched(4388576018402626L);
        assertTrue(isMatch);

        isMatch = CreditCardNumberValidation.prefixMatched(378576018402626L);
        assertTrue(isMatch);

        isMatch = CreditCardNumberValidation.prefixMatched(78576018402626L);
        assertFalse(isMatch);
    }

    @Test
    void canSumDoubleOddPlacedDigits(){
        assertEquals(37,CreditCardNumberValidation.getSumOfDoubleOddPlacedDigits(4388576018402626L));
    }

    @Test
    void canSumEvenPlacedDigits(){
        assertEquals(38,CreditCardNumberValidation.getSumOfEvenPlacedDigits(4388576018402626L));
    }

    @Test
    void canDetermineIfAValidCardNumberISValid(){
        assertTrue(CreditCardNumberValidation.isValid(4388576018410707L));
        assertFalse(CreditCardNumberValidation.isValid(4388576018402626L));
    }
}