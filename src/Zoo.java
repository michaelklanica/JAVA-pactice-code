public class Zoo {
    public static void main(String[] args) {

        Animal bill = new Animal ("Bill", 45, 55);
        Animal jon = new Animal ("Jon", 23, 4);

        bill.sleep();
        jon.eat();

        Bird bird1 = new Bird("big bird", 23, 55);
        bird1.fly();


    }


}
