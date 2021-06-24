package africa.semicolon.bankApp;

import java.time.LocalDate;

public class Date implements Cloneable{

        private int month;
        private int day;
        private int year;

        public Date(int day, int month, int year) {

            this.year = year;
            this.month = 1;
            if (month > 0 && month <= 12) {
                    this.month = month;
                }else {
                    throw new IllegalArgumentException("Wrong Month Value");
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
            }else {
                throw new IllegalArgumentException("Wrong Day Value");
            }

        }

        public void setDay(int day) {
            this.day = 1;
            int maxDay;
            boolean theMonthIsFebruary = month == 2;
            boolean ItIsALeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
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
            }else {
                throw new IllegalArgumentException("Wrong Day Value");
            }
        }

        public int getDay() {
            return this.day;
        }

        public void setMonth(int month) {
            if(month > 0 && month <= 12){
                    this.month = month;
                }else {
                throw new IllegalArgumentException("Wrong Month Value");
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

        public String getDateOfBirth() {
            return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
        }

        public int getAge() {
            LocalDate today = LocalDate.now();
            return today.getYear() - this.getYear();
        }

        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

}
