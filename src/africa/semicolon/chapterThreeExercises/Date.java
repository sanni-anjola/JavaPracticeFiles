package africa.semicolon.chapterThreeExercises;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = 1;
        if (month > 0) {
            if (month <= 12) {
                this.month = month;
            }
        }
        this.day = 1;
        if (day > 0) {
            if (day <= 31) {
                this.day = day;
            }
        }
    }

    public void setDay(int day) {
        if(day > 0){
            if(day < 31){
                this.day = day;
            }
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setMonth(int month) {
        if(month > 0){
            if(month <= 12){
                this.month = month;
            }
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String displayDate() {
        return String.format("%04d/%02d/%02d", this.year, this.month, this.day);
    }
}
