package africa.semicolon.chapterEightExercises;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

class BookEnumTest {

    @Test
    void testingEnumTypes(){
        for (BookEnum book : BookEnum.values()){
            System.out.println(book.getTitle());
        }

        for (BookEnum book : EnumSet.range(BookEnum.JHTP, BookEnum.IW3HTP)){
            System.out.println(book.getTitle() + "\t" + book.getCopyrightYear());
        }
    }

}