package exceptionspractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsPractice {
    // EXAMPLES OF BUILT-IN EXCEPTIONS
    public static void main(String args[]) {

        // Java program to demonstrate ArithmeticException
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }

        //Java program to demonstrate NullPointerException
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        // Java program to demonstrate StringIndexOutOfBoundsException
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }

        //Java program to demonstrate FileNotFoundException
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        // Java program to demonstrate NumberFormatException
        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }

        // Java program to demonstrate ArrayIndexOutOfBoundException
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }

    }

}
