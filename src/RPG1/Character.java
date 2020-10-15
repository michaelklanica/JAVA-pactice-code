package RPG1;

import java.util.ArrayList;
import java.util.Random;

public class Character {

    private String name;

    // To randomly generate a character:
    // 300 points are randomly distributed between all 6 character statistics

    // PHYSICAL STATISTICS [ physicalScore = ((str + dex + con)/300)*100 ]
    private int str = 0;      // STRENGTH measures physical power and carrying capacity
    private int dex = 0;      // DEXTERITY measures agility, balance, coordination, and reflexes
    private int con = 0;     // CONSTITUTION measures endurance, stamina, and good health
    // MENTAL STATISTICS [ mentalScore = ((intel + wis + cha)/300)*100 ]
    private int intel = 0;    // INTELLIGENCE measures deductive reasoning, knowledge, memory, logic, and rationality
    private int wis = 0;      // WISDOM measures self-awareness, common sense, restraint, perception, and insight
    private int cha = 0;      // CHARISMA measures force of personality, persuasiveness, leadership, and successful
    int [] charStatArray = new int[6];



    // Generate Stats
    public void generateCharacter() {
        
        Random random = new Random();
        for (int i = 0; i < 300; i+=1) {
            int randStat = random.nextInt(5);
            switch (randStat) {
                case 0:
                    str+=1;
                    break;
                case 1:
                    str+=1;
                    break;
                case 2:
                    str+=1;
                    break;
                case 3:
                    str+=1;
                    break;
                case 4:
                    str+=1;
                    break;
                case 5:
                    str+=1;
                    break;
            }
        }

    }


}





