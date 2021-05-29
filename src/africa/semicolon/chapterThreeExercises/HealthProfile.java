package africa.semicolon.chapterThreeExercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.month = 1;
        if (month > 0) {
            if (month <= 12) {
                this.month = month;
            }
        }
        this.day = 1;
        byte maxDay;
        boolean theMonthIsFebruary = month == 2;
        boolean ItIsALeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean theMonthHas30Days = month == 8 || month == 4 || month == 6 || month == 11;
        if(theMonthIsFebruary){
            if(ItIsALeapYear){
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        } else if(theMonthHas30Days){
            maxDay = 30;
        }else{
            maxDay = 31;
        }

        boolean itIsAValidDay = day > 0 && day <= maxDay;
        if(itIsAValidDay){
            this.day = day;
        }

        if(height > 0.0){
            this.height = height;
        }

        if(weight > 0.0){
            this.weight = weight;
        }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDay(int day) {
        this.day = 1;
        int maxDay;
        boolean theMonthIsFebruary = month == 2;
        boolean ItIsALeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean theMonthHas30Days = month == 8 || month == 4 || month == 6 || month == 11;
        if(theMonthIsFebruary){
            if(ItIsALeapYear){
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        } else if(theMonthHas30Days){
            maxDay = 30;
        }else{
            maxDay = 31;
        }

        boolean itIsAValidDay = day > 0 && day <= maxDay;
        if(itIsAValidDay){
            this.day = day;
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

    public double getHeight() {
        return height;
    }

    public String getDateOfBirth() {
        return String.format("%04d/%02d/%02d", this.year, this.month, this.day);
    }

    public void setHeight(double height) {
        if(height > 0.0) this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0.0) this.weight = weight;
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

    public double bmi() {
        double bmi = (this.weight * 703) / (height * height);
        return bmi;
    }

    public String displayHealthProfile(){

        String healthProfileDisplay = String.format("Name: %s %s%nGender: %s%nDate Of Birth: %s%nAge: %d%nMaximum Heart Rate: %d%nTarget HeartRate Range: %s%nBMI: %.2f",
                this.lastName, this.firstName, this.gender, this.getDateOfBirth(), this.getAge(), this.getMaximumHeartRate(), this.getTargetHeartRateRange(), this.bmi());

        return healthProfileDisplay;
    }
}
