package RPG1;

public class RPGgamplay {

    public static void main(String[] args) {

        // CHARACTER CREATION
        String name = Character.chooseName();
        String race = Character.chooseRace();
        String subRace = Character.chooseSubRace(race);

        if (race.equals("Dwarf")) {
            int abilityScoreIncrease = 0;
            int age = 0;
            String alignment = null;
            String size = null;
            int speed = 0;
            String[] languages = {""};
        }



        System.out.println("name = " + name);
        System.out.println("race = " + race);
        System.out.println("subRace = " + subRace);



    }

}
