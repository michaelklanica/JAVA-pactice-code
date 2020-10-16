public class Sparrow extends Bird implements Flyable{

    public Sparrow(String aName, int anAge, int aWeight) {
        super(aName, anAge, aWeight);
    }

    public void fly() {
        System.out.println(this.name + " is flying...");
    }

}
