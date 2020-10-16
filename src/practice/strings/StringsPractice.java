package practice.strings;

public class StringsPractice {

    public static void main(String[] args) {

        String str = "ABCDEFG";
        System.out.println(str);
        System.out.println("str.length() = " + str.length());

        String extractedString = str.substring(3,5);
        System.out.println("extractedString = " + extractedString);

        String a = "hello";
        String b = "HELLO";
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(b) = " + a.equalsIgnoreCase(b));

        System.out.println("a.charAt(2) = " + a.charAt(2));
        System.out.println("a.indexOf(\"ll\") = " + a.indexOf("ll"));
        System.out.println("a.indexOf('l') = " + a.indexOf('l'));
        System.out.println("a.lastIndexOf('l') = " + a.lastIndexOf('l'));

    }


}
