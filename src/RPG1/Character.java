package RPG1;

import java.util.Scanner;

public class Character {

    public String name;
    public String race;
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





    private int hitPoints;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Character(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }


    public static void main(String[] args) {
        String name = chooseName();
        String race = chooseRace();

        System.out.println("name = " + name);
        System.out.println("race = " + race);


        Character newPlayer = new Character(name, 100);
        System.out.println("player1.getName() = " + newPlayer.getName());
        System.out.println("player1.getHitPoints() = " + newPlayer.getHitPoints());

        System.out.println("diceRoll(6, 4) = " + Dice.diceRoll(6, 4));

    }
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


}





