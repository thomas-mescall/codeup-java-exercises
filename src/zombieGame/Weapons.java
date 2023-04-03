package zombieGame;

import java.util.Scanner;

public class Weapons {
    public static String weaponClass(){
        Scanner myScanner = new Scanner(System.in);

        //building weapon selection
        System.out.println("CHOOSE YOUR WEAPON");
        System.out.println("(1) Book");
        System.out.println("(2) Baseball Bat");
        System.out.println("(3) Bo Staff");
        System.out.println("(4) Chainsaw");
        System.out.println("(5) Chopstick");
        System.out.println("(6) Crowbar");
        System.out.println("(7) Machete");
        System.out.println("(8) Meat Cleaver");
        System.out.println("(9) Running Shoes");
        System.out.println("(10) Sledge Hammer");

        int userInput = myScanner.nextInt();
        String weaponSelected = "";
        boolean weaponSelect = false;
        while(!weaponSelect) {
            switch (userInput){
                case 1:
                    System.out.println("Not a very effective weapon for combat. It can be used as a blunt object, but it's not very durable or powerful.");
                    weaponSelected = "Book";
                    weaponSelect = true;
                    break;
                case 2:
                    System.out.println(" A classic melee weapon that is relatively easy to find and use. It's durable and can deal significant damage, especially with a solid swing.");
                    weaponSelected = "Baseball Bat";
                    weaponSelect = true;
                    break;
                case 3:
                    System.out.println("A versatile weapon that can be used for both defense and offense. It requires some skill and training to use effectively, but can be very effective in the right hands.");
                    weaponSelected = "Bo Staff";
                    weaponSelect = true;
                    break;
                case 4:
                    System.out.println("A very powerful and intimidating weapon that can tear through flesh and bone. However, it's heavy, noisy, and requires fuel to operate, so it's not the most practical weapon for everyday use.");
                    weaponSelected = "Chainsaw";
                    weaponSelect = true;
                    break;
                case 5:
                    System.out.println("Not a very effective weapon for combat. It's too small and fragile to deal significant damage or defend against attacks.");
                    weaponSelected = "Chopstick";
                    weaponSelect = true;
                    break;
                case 6:
                    System.out.println("A versatile weapon that can be used for both breaking and entering as well as combat. It's durable and can deal significant damage with a solid strike.");
                    weaponSelected = "Crowbar";
                    weaponSelect = true;
                    break;
                case 7:
                    System.out.println("A sharp and deadly weapon that can cut through foliage and zombie flesh with ease. It's durable and relatively easy to use, but requires some skill to use effectively.");
                    weaponSelected = "Machete";
                    weaponSelect = true;
                    break;
                case 8:
                    System.out.println("A sharp and heavy weapon that can deal significant damage, especially with a strong swing. It's not the most durable weapon, however, and can be difficult to use in close quarters.");
                    weaponSelected = "Meat Cleaver";
                    weaponSelect = true;
                    break;
                case 9:
                    System.out.println("Not a weapon per se, but important for survival and evasion. Good running shoes can help you outrun zombies or escape dangerous situations, but they won't help you in combat.");
                    weaponSelected = "Running Shoes";
                    weaponSelect = true;
                    break;
                case 10:
                    System.out.println("A heavy and powerful weapon that can deal massive damage with a single strike. It's not the most agile weapon, but it can be very effective in the right hands.");
                    weaponSelected = "Sledge Hammer";
                    weaponSelect = true;
                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID WEAPON ID");
                    userInput = myScanner.nextInt();
            }
        }
        return weaponSelected;
    }
}
