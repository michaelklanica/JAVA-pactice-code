public class Fish extends Animal{

    public Fish(String aName, int anAge, int aWeight) {
        super(aName, anAge, aWeight);
    }

    @Override
    public void move() {
        System.out.println(this.name + " is swimming fast");
    }

    public void swim() {
        System.out.println(this.name + " is swimming...");
    }

}
