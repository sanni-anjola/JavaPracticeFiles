package africa.semicolon.diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    void diaryCaNBeCreated(){
        Diary diary = new Diary("Hatred Stories");
        assertNotNull(diary);
        assertEquals("Hatred Stories", diary.getTitle());
    }

    @Test
    void diaryCanAddEntryTest(){
        Diary diary = new Diary("Confidence Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");

        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());

    }

    @Test
    void diaryCanAddEntriesAsStringTest(){
        Diary diary = new Diary("Blessing's Diary");
        diary.addEntry("Heart Torn Apart", "It was a cold sunny Wednesday...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.addEntry("And He came Begging", "Turn to page 2...");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    void entriesCanBeSearchedBYTitle(){
        Diary diary = new Diary("Blessing's Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");
        diary.addEntry(entry);
        diary.addEntry("Heart Torn Apart", "It was a cold sunny Wednesday...");
        diary.addEntry("And He came Begging", "Turn to page 2...");
        assertEquals(entry, diary.findEntriesByTitle("Ordinary Cake"));
    }

    @Test
    void entriesCanBeDeletedBYTitle(){
        Diary diary = new Diary("Blessing's Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");
        diary.addEntry(entry);
        diary.addEntry("Heart Torn Apart", "It was a cold sunny Wednesday...");
        diary.addEntry("And He came Begging", "Turn to page 2...");
        diary.deleteEntryByTitle("Ordinary Cake");

        assertEquals(2, diary.getNumberOfEntries());
    }
}
