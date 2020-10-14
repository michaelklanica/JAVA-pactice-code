package java_basics;

public class MyUtils {

    public static String returnAString(String myArgument) {
        return "myArgument = " + myArgument;
    }

    public void sum2Numbers(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static int add10(int someArgument) {
        int result = someArgument + 10;
        return result;
    }

}
