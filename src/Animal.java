public abstract class Animal {

    public int age;
    public int weightInPounds;
    public String name;

    public Animal (String aName, int anAge, int aWeight) {
        this.name = aName;
        this.age = anAge;
        this.weightInPounds = aWeight;
    }

    public void eat(){
        System.out.println(this.name + " is eating...");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping...");
    }

    public abstract void move();



}
