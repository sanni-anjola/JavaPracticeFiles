package africa.semicolon.leetcode.arrays;

import java.util.*;

public class Veterinarian {
    private Queue<String> pets = new ArrayDeque<>();
    public void accept(String petName){
        pets.add(petName);
    }
    public String heal(){
        if(pets.size() <= 0) return null;
        return pets.remove();
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Berkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}



