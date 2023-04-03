package zombieGame;

import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args){
        Characters characters = new Characters();
        Weapons weapons = new Weapons();

//        System.out.println(characters.characterClass());
//        System.out.println(weapons.weaponClass());

        String yourCharacter[] = {characters.characterClass(), weapons.weaponClass()};
        System.out.println("Your character is: " + yourCharacter[0]);
        System.out.println("Your weapon of choice is: " + yourCharacter[1]);
        //game loop
//        Scanner myScanner = new Scanner(System.in);
//        int health = 100;
//        int score = 0;
//        while(health > 0){
//
//        }
    }
}
