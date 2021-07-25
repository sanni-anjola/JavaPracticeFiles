package africa.semicolon.chapterSixExercises;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ComputerAssistedInstruction635Test {

    @Test
    void testThatComputerAssistedInstruction_canGenerateQuestion(){
        byte[] keyStart = "this is a key".getBytes();
//        SecureRandom random = new SecureRandom();
        Random random = new Random(5);
//        random.setSeed(keyStart);
        int num1 = 1 + random.nextInt(9);
        int num2 = 1 + random.nextInt(9);
        String question = "How much is "+ num1 + " times " +num2+"? ";
        System.out.println(question);
        assertEquals(question, ComputerAssistedInstruction635.getQuestion());

    }

    @Test
    void testThatAnswerCanBeMarked(){
        String question = ComputerAssistedInstruction635.getQuestion();
        System.out.println(ComputerAssistedInstruction635.values[2]);

        assertFalse(ComputerAssistedInstruction635.getAnswer(17));
        assertTrue(ComputerAssistedInstruction635.getAnswer(18));

    }

}