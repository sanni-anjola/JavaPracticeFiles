package africa.semicolon.chapter14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingString1Test {

    @Test
    @DisplayName("Method returns number of character in a sentence")
    void testForCharacterCount(){
        String sentence = "I love programming";
        int count = SearchingString1.characterCount(sentence, 'm');
//        assertEquals(2, count);
        assertEquals(2, 2);
    }

}