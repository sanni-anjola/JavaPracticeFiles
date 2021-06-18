package africa.semicolon.chapterEightExercises;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time Format");
        }
            this.hour = hour;
            this.minute = minute;
            this.second = second;
    }

    public String toUniversalTime(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute,
                second,
                hour < 12 ? "AM" : "PM");

    }

    public String displayTime(int hour, int minute, int second){
        try {

            this.setTime(hour,minute,second);
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            return e.getMessage();
        }
        return this.toString();
    }
}
