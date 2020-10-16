public class Bird extends Animal{

    public Bird(String aName, int anAge, int aWeight) {
        super(aName, anAge, aWeight);
    }

    @Override
    public void move() {
        System.out.println(this.name + " is flapping wings.");
    }


}
