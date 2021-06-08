package africa.semicolon.chapterFourExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    private Cryptography cryptography;
    @BeforeEach
    void setUp() {
        cryptography = new Cryptography();
    }

    @Test
    void testThatCryptographyCanEnCryptNumbers(){
        assertEquals("0189", cryptography.encrypt(1234, 7));
    }

    @Test
    void testThatCryptographyCanDeCryptNumbers(){
        assertEquals("1234", cryptography.encrypt(189, -7));
    }
}