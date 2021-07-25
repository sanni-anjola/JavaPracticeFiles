package africa.semicolon.oop;

public class BarkSound implements SoundBehaviour{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
