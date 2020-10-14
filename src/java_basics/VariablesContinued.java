package java_basics;

public class VariablesContinued {

    public static void main(String[] args) {

        // PRIMITIVE DATA-TYPES
        byte byteNumber = 127;  // 8-bit data type; value between -128 and 127
        short shortNumber = 32767;  // 16-bit data type; value between -32768 and 32767
        int intNumber = 2147483647; // 32-bit data type; 'big number'
        long longNumber = 9223372036854775807L; // 64-bit data-type; 'very big number'; note the 'L'
        float floatNumber = 500.1234567890F;    // decimal number
        double doubleNumber = 500.1234567890;   // more precise than float
        boolean decision = true;    // or false.
        char letter = 's';  // stores single characters

        // EXPLICIT CASTING - sacrifices precision
        byte anotherByte = (byte) 127.000006;   // add the type-casting-to in ().
         System.out.println(anotherByte);
        // IMPLICIT CATSING - casts a smaller number to a larger 'container' (data type)
        int anotherInt = byteNumber;






    }

}
