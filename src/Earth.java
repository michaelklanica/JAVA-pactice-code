public class Earth {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tommy";
        tom.speak();

        Human joe = new Human("Joey", 45, 60, "blue");
        joe.speak();
    }
}
