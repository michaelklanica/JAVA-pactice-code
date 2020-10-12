public class Animal {

    public int age;
    public int weightInPounds;
    public String name;

    public Animal (String aName, int anAge, int aWeight) {
        this.name = aName;
        this.age = anAge;
        this.weightInPounds = aWeight;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }



}
