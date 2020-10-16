public class Zoo {
    public static void main(String[] args) {

        Animal bird1 = new Bird("big bird", 23, 55);
        bird1.sleep();

        Chicken chick1 = new Chicken("Ted", 5, 34);
        chick1.move();

        Sparrow spare = new Sparrow("Carl", 45, 87);
        spare.fly();

        moveAnimal(bird1);

        Flyable flyingbird = new Sparrow("Dodo", 5,4);
        flyingbird.fly();
    }

    public static void moveAnimal (Animal animal) {
        animal.move();
    }

}
