import java.util.Scanner;

public class AdventureGame {

    public static int characterClass(){
        Scanner myScanner = new Scanner(System.in);

        //building character menu
        System.out.println("CHOOSE YOUR CHARACTER: ");
        System.out.println("(1) Doctor");
        System.out.println("(2) Soldier");
        System.out.println("(3) Farmer");
        System.out.println("(4) Police Officer");
        System.out.println("(5) Teenager");
        System.out.println("(6) Mechanic");
        System.out.println("(7) Elderly Person");

        //building character descriptions
        int userInput = myScanner.nextInt();
        boolean characterSelect = false;
        while(!characterSelect) {
            if (userInput == 1) {
                System.out.println("A doctor can provide medical assistance and knowledge of diseases but lacks the ability to think outside the box.");
                characterSelect = true;
            } else if (userInput == 2) {
                System.out.println("A soldier with combat skills and survival training but is hard to get along with others.");
                characterSelect = true;
            } else if (userInput == 3) {
                System.out.println("A farmer can provide food and knowledge of agriculture but lacks technical skills.");
                characterSelect = true;
            } else if (userInput == 4) {
                System.out.println("A police officer has firearms training and knowledge of tactics but struggles to understand others.");
                characterSelect = true;
            } else if (userInput == 5) {
                System.out.println("A teenager is fast and agile, but lacks experience and skills.");
                characterSelect = true;
            } else if (userInput == 6) {
                System.out.println("A mechanic can fix vehicles and create improvised weapons but cannot read.");
                characterSelect = true;
            } else if (userInput == 7) {
                System.out.println("An elderly person may not be physically strong, but has wisdom and knowledge of survival techniques and is blind.");
                characterSelect = true;
            } else {
                System.out.println("PLEASE ENTER A VALID CHARACTER ID");
                userInput = myScanner.nextInt();
            }
        }
        myScanner.nextLine();
        return userInput;
    }
    public static int weaponClass(){
        Scanner myScanner = new Scanner(System.in);

        //building weapon selection
        System.out.println("CHOOSE YOUR WEAPON");
        System.out.println("(1) Book");
        System.out.println("(2) Baseball bat");
        System.out.println("(3) Bo Staff");
        System.out.println("(4) Chainsaw");
        System.out.println("(5) Chopstick");
        System.out.println("(6) Crowbar");
        System.out.println("(7) Machete");
        System.out.println("(8) Meat Cleaver");
        System.out.println("(9) Running Shoes");
        System.out.println("(10) Sledge Hammer");

        int userInput = myScanner.nextInt();
        boolean weaponSelect = false;
        while(!weaponSelect) {
            if(userInput == 1){
                System.out.println("Not a very effective weapon for combat. It can be used as a blunt object, but it's not very durable or powerful.");
                weaponSelect = true;
            }else if(userInput == 2) {
                System.out.println(" A classic melee weapon that is relatively easy to find and use. It's durable and can deal significant damage, especially with a solid swing.");
                weaponSelect = true;
            }else if(userInput == 3) {
                System.out.println("A versatile weapon that can be used for both defense and offense. It requires some skill and training to use effectively, but can be very effective in the right hands.");
                weaponSelect = true;
            }else if(userInput == 4) {
                System.out.println("A very powerful and intimidating weapon that can tear through flesh and bone. However, it's heavy, noisy, and requires fuel to operate, so it's not the most practical weapon for everyday use.");
                weaponSelect = true;
            }else if(userInput == 5) {
                System.out.println("Not a very effective weapon for combat. It's too small and fragile to deal significant damage or defend against attacks.");
                weaponSelect = true;
            }else if(userInput == 6) {
                System.out.println("A versatile weapon that can be used for both breaking and entering as well as combat. It's durable and can deal significant damage with a solid strike.");
                weaponSelect = true;
            }else if(userInput == 7) {
                System.out.println("A sharp and deadly weapon that can cut through foliage and zombie flesh with ease. It's durable and relatively easy to use, but requires some skill to use effectively.");
                weaponSelect = true;
            }else if(userInput == 8) {
                System.out.println("A sharp and heavy weapon that can deal significant damage, especially with a strong swing. It's not the most durable weapon, however, and can be difficult to use in close quarters.");
                weaponSelect = true;
            }else if(userInput == 9) {
                System.out.println("Not a weapon per se, but important for survival and evasion. Good running shoes can help you outrun zombies or escape dangerous situations, but they won't help you in combat.");
                weaponSelect = true;
            }else if(userInput == 10) {
                System.out.println("A heavy and powerful weapon that can deal massive damage with a single strike. It's not the most agile weapon, but it can be very effective in the right hands.");
                weaponSelect = true;
            }else{
                System.out.println("PLEASE ENTER A VALID WEAPON ID");
                userInput = myScanner.nextInt();
            }
        }
        return userInput;
    }
    public static String DoctorScenarios(){
        Scanner myScanner = new Scanner(System.in);

        //building scenarios
        System.out.println("While performing open heart surgery your patient's arm begins to move and his eyes open. The patient quickly grabs your assistant's hand and bites a chunk out of it. You quickly jump back in disbelief and grab a...");
    }
    public static void main(String[] args){
        System.out.println(characterClass());
        System.out.println(weaponClass());
    }
}
