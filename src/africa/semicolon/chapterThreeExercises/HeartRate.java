package africa.semicolon.chapterThreeExercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRate(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR) - this.getYear();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRateRange() {
        int lowTargetHeartRate = 50 * this.getMaximumHeartRate();
        int highTargetHeartRate = 85 * this.getMaximumHeartRate();

        return String.format("%d.%02d - %d.%02d", lowTargetHeartRate/100, lowTargetHeartRate%100,
                highTargetHeartRate/100, highTargetHeartRate%100);
    }
}
