package africa.semicolon.oop;

public class AnimalApp {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
        asterisks("*");
    }

    public static void asterisks(String symbol){
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j <= 4 ; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
