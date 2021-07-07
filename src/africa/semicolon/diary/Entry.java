package africa.semicolon.diary;

import java.time.LocalDateTime;

public class Entry {
    private final LocalDateTime dateTime;
    private String title;
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Entry() {
        dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return dateTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
