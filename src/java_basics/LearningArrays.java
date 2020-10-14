package java_basics;

public class LearningArrays {

    public static void main(String[] args) {
        // ARRAYS --- in Java, arrays are assigned a fixed number of indices when declared.
        int [] values = new int[100];   // this integer array variable (values) has been declared with 100 'slots'.
        values[0] = 1234;   // assigning a value of 1234 to the 0 index
        values[99] = 9876;  // assigning a value of 9876 to the 99 index
//        values[1] = "hello"; // example of trying to store the wrong data type.
        System.out.println("values[0] = " + values[0]);
        System.out.println("values[50] = " + values[50]); // nothing stored at this index; int is 0 by default.
        System.out.println("values[99] = " + values[99]);
//        System.out.println(values[100]);  // This index is out of bounds
        System.out.println("values.length = " + values.length);

        String [] words = new String[] {"My", "name", "is", "Mike." };
        System.out.println("words[3] = " + words[3]);
        System.out.println("words.length = " + words.length);
        String [] noWordsHere = new String[3];
        System.out.println("noWordsHere[2] = " + noWordsHere[2]);   // strings (and all objects) are null by default.

    }

}
