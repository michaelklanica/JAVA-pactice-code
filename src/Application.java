import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text.");
        String enteredText = input.nextLine();
        System.out.println("enteredText = " + enteredText);


    }

}