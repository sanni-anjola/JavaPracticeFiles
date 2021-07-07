package africa.semicolon.diary;

import java.util.ArrayList;

public class Diary {
    private final String diaryTitle;
    ArrayList<Entry> entries;

    public Diary(String diaryTitle) {
        this.diaryTitle = diaryTitle;
        this.entries = new ArrayList<>();
    }

    public String getTitle() {
        return diaryTitle;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void addEntry(String entryTitle, String entryBody) {
        Entry entry = new Entry();
        entry.setBody(entryBody);
        entry.setTitle(entryTitle);
        addEntry(entry);
    }

    public Entry findEntriesByTitle(String title) {
        for (Entry entry : entries){
            if(entry.getTitle().equals(title)){
                return entry;
            }
        }
        return null;
    }

    public void deleteEntryByTitle(String title) {
        Entry foundEntry = findEntriesByTitle(title);

        entries.remove(foundEntry);
    }
}
