package africa.semicolon.chapterEightExercises;

public enum BookEnum {

    // declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World wide web How to program", "2012"),
    CPPHTP("C++ How to program", "2014"),
    VBHTP("Visual Basic How to program", "2014"),
    CSHARPHTP("C# How to program", "2014");



    // Instance fields
    private final String title; //book title
    private final String copyrightYear;

    BookEnum(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
