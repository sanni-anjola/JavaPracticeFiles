package africa.semicolon.diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    @Test
    void entryCanBeCreatedTest(){
        Entry entry = new Entry();
        assertNotNull(entry);
    }

    @Test
    void entry_hasDate_afterCreation(){
        Entry entry = new Entry();
        assertNotNull(entry.getDate());
    }

    @Test
    void entryHasATitleTest(){
        Entry entry = new Entry();
        entry.setTitle("My break up experience with lenny");
        assertEquals("My break up experience with lenny", entry.getTitle());
    }

    @Test
    void entryHasATitleBody(){
        Entry entry = new Entry();
        String entryBody = """
                I dinor do anything oh, He just came and said he wanted to work,
                He said he wasn't me but him.
                """;
        entry.setBody(entryBody);
        assertEquals(entryBody, entry.getBody());
    }

}