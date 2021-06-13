package africa.semicolon.chapterSixExercises;

public class GreatestCommonDivisor {

    public int gcd(int firstNumber, int secondNumber) {
        if(firstNumber == 0) return secondNumber;
        if(secondNumber == 0) return firstNumber;
        if(firstNumber > secondNumber) {
            return  gcd(firstNumber % secondNumber, secondNumber);
        }else{
            return gcd(firstNumber, secondNumber % firstNumber);
        }
    }

}
