package contactsmanagerCLIapp;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String fullName;
    private String lastFirst;

    Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.lastFirst = this.lastName + this.firstName;
        this.phoneNumber = phoneNumber;
    }

    public static void viewContacts() {
        System.out.println("view your contacts");
    }

    public static void addContact() {
        HashMap<String, Contact> contactList = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("ADD A CONTACT\n\nEnter the last name: ");
        String lastName = input.nextLine();
        System.out.print("\nEnter the first name: ");
        String firstName = input.nextLine();
        System.out.print("\nEnter the phone number: ");
        String phoneNumber = input.nextLine();

    }

    public static void searchContacts() {
        System.out.println("search your contacts");
    }

    public static void deleteContact() {
        System.out.println("delete a contact");
    }

}
