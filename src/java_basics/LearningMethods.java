package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {

    public static void main(String[] args) {
    // 'void' -- does not return anything.
    // 'public' is an access modifier -- visibility -- 'private' will cause the method or field to only be used locally.
    // 'static' keyword indicates a class field or method; removing 'static' will make them instance fields or methods
        System.out.println("qwerty");
        printSomeJunk("I love Texas.");
        printSomePassedInData(9876);
        System.out.println(MyUtils.returnAString("Hello world!")); // this method is defined in MyUtils class
        System.out.println(MyUtils.add10(200) + 1000);
        System.out.println("ExampleClass.dosomething() = " + ExampleClass.dosomething());

        // invoking non-static method in MyUtils
        MyUtils myVar;
        myVar = new MyUtils();
        myVar.sum2Numbers(10, 23);

    }

    public static void printSomeJunk(String andAnArgument) {
        System.out.println("Blah blah blah..." + andAnArgument);
    }

    private static void printSomePassedInData(int data) {
        System.out.println(data + 9999);
    }

}
