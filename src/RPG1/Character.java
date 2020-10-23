package RPG1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Character {

    private String name;
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




        Character player1 = new Character("Al", 100);

        System.out.println("player1.getName() = " + player1.getName());
        System.out.println("player1.getHitPoints() = " + player1.getHitPoints());


    }
}





