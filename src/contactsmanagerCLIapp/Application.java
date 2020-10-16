package contactsmanagerCLIapp;


import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import static contactsmanagerCLIapp.Contact.*;

public class Application {

    public static void main(String[] args) {

        showMainMenu();

    }

    public static void showMainMenu() {
        // ALLOW USER TO SELECT AN OPTION
        Scanner input = new Scanner(System.in);
        System.out.print("1. View Contacts.\n2. Add a New Contact\n3. Search a Contact by Name\n4.Delete an " +
                "Existing Contact\n5. EXIT\nEnter an Option (1, 2, 3, 4, or 5): ");
        int menuOption = 0;
        try {
            menuOption = input.nextInt();
        } catch (InputMismatchException ignored) {
        }

        // LIST OF OPTIONS
        switch (menuOption) {
            case 1:
                viewContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContacts();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                System.out.println("EXITING...");
                return;
            default:
                System.out.println("Please Choose Options 1 to 5");
                showMainMenu();
        }

    }

}
