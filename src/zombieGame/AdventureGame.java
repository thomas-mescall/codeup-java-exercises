package zombieGame;
public class AdventureGame {

    public static void main(String[] args){
        Characters characters = new Characters();
        Weapons weapons = new Weapons();
        System.out.println(characters.characterClass());
        System.out.println(weapons.weaponClass());
    }
}
