package RPG1;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {

    public String name;
    public String race;
    public String subRace;
    public String clss;
    public int level;
    public String alignment;
    public int experiencePoints;

    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;

    public int armorClass;
    public int initiative;
    public int speed;
    public int maxHitPoints;
    public int currentHitPoints;
    public int temporaryHitPoints;


    public static String chooseName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character's name: ");
        String charName = scan.nextLine();
        return charName;
    }

    public static String chooseRace() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the character's race: \n1. Dwarf\n2. Elf\n3. Halfling\n4. Human");
        int choice = scan.nextInt();
        String race = null;
        switch (choice) {
            case 1:
                race = "Dwarf";
                break;
            case 2:
                race = "Elf";
                break;
            case 3:
                race = "Halfling";
                break;
            case 4:
                race = "Human";
                break;
            default:
                chooseRace();
        }
        return race;
    }

    public static String chooseSubRace(String race) {
        Scanner scan = new Scanner(System.in);
        String subRace = null;
        if (race.equals("Dwarf")) {
            System.out.println("Choose a sub-race:\n1. Hill Dwarf\n2. Mountain Dwarf");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    subRace = "Hill Dwarf";
                    break;
                case 2:
                    subRace = "Mountain Dwarf";
                    break;
            }
        } else if (race.equals("Elf")) {
            System.out.println("Choose a sub-race:\n1. Wood Elf\n2. High Elf");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    subRace = "Wood Elf";
                    break;
                case 2:
                    subRace = "High Elf";
                    break;
            }
        } else if (race.equals("Halfling")) {
            System.out.println("Choose a sub-race:\n1. Lightfoot\n2. Stout");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    subRace = "Lightfoot";
                    break;
                case 2:
                    subRace = "Stout";
                    break;
            }
        } else {
            subRace = "none";
        }
        return subRace;
    }

    public static ArrayList generateBaseAttributeScores() {
        ArrayList<Integer> attributeArray = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            attributeArray.add(Dice.diceRoll(6, 3));
        }
        return attributeArray;
    }

}





