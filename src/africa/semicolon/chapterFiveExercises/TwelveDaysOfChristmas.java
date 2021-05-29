package africa.semicolon.chapterFiveExercises;

public class TwelveDaysOfChristmas {
    
    public String sing(int day){
        StringBuilder song = new StringBuilder("On the ");

        switch (day){
            case 1: song.append("First");
                break;
            case 2: song.append("Second");
                break;
            case 3: song.append("Third");
                break;
            case 4: song.append("Fourth");
                break;
            case 5: song.append("Fifth");
                break;
            case 6: song.append("Sixth");
                break;
            case 7: song.append("Seventh");
                break;
            case 8: song.append("Eighth");
                break;
            case 9: song.append("Ninth");
                break;
            case 10: song.append("Tenth");
                break;
            case 11: song.append("Eleventh");
                break;
            case 12: song.append("Twelfth");
                break;
            case -1: return "";
            default:
                return "Invalid input";
        }
        song.append(" day of Christmas, my true love sent to me\n");
        switch (day){
            case 12: song.append("Twelve drummers drumming\n");
            case 11: song.append("Eleven pipers piping\n");
            case 10: song.append("Ten lords a-leaping\n");
            case 9: song.append("Nine ladies dancing\n");
            case 8: song.append("Eight maids a-milking\n");
            case 7: song.append("Seven swans a-swimming\n");
            case 6: song.append("Six geese a-laying\n");
            case 5: song.append("Five gold rings\n");
            case 4: song.append("Four calling birds\n");
            case 3: song.append("Three French Hens\n");
            case 2: song.append("Two Turtle Doves\nand ");
            case 1: song.append("A partridge in a pear tree");
        }

        return song.toString();
        
    }
}
