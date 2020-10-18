package FileIOPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileIOPractice {

    public static void main(String[] arg) throws IOException {

        String directoryName = "data";
        String fileName = "grocery_list.txt";

        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);

            }

            if (!Files.exists(dataFilePath)) {
                Files.createFile(dataFilePath);
            }

        } catch (IOException ex) {
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }

        showMainMenu(dataFilePath);

    }

    public static void showMainMenu(Path dataFilePath) throws IOException {
        // ALLOW USER TO SELECT AN OPTION
        Scanner input = new Scanner(System.in);
        System.out.print("1. View contacts.Contacts.\n2. Add a New Contact\n3. Search a Contact by Name\n4. Delete an" +
                " " +
                "Existing Contact\n5. EXIT\nEnter an Option (1, 2, 3, 4, or 5): ");
        int menuOption = 0;
        try {
            menuOption = input.nextInt();
        } catch (InputMismatchException ignored) {
        }

        // LIST OF OPTIONS
        switch (menuOption) {
            case 1:
                System.out.println("View Contacts");



                break;
            case 2:
                Scanner contactInput = new Scanner(System.in);
                System.out.print("Enter Contact Name: ");
                String fullName = contactInput.nextLine();
                System.out.print("Enter the Contact's Phone Number: ");
                int phoneNumber = 0;
                try {
                    phoneNumber = contactInput.nextInt();
                } catch (InputMismatchException e) {
                    e.getStackTrace();
                }
                String contactString = fullName + ":" + phoneNumber;
                Files.write(dataFilePath, Arrays.asList(contactString), StandardOpenOption.APPEND);
                List<String> fileContents = Files.readAllLines(dataFilePath);
                System.out.println();
                for (int i = 0; i < fileContents.size(); i++) {
                    System.out.printf("%s\n", fileContents.get(i));
                }
                break;
            case 3:
                System.out.println("Search Contacts");
                break;
            case 4:
                System.out.println("Delete a Contact");
                break;
            case 5:
                System.out.println("EXITING...");
                return;
            default:
                System.out.println("Please Choose Options 1 to 5");
                showMainMenu(dataFilePath);
        }

    }

}
