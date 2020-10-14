package java_basics;

public class ControlFlow {

    public static void main(String[] args) {

        // if / else-if / else statements will evaluate an expression(s) as true or false and branch code
        // EXAMPLE 1
        boolean hungry = true;

        if (hungry) {
            System.out.println("I'm starving.");
        } else {
            System.out.println("I'm not hungry.");
        }

        // EXAMPLE 2
        int number = 5;

        if (number > 5) {
            System.out.println("number is greater than 5");
        } else if (number < 5) {
            System.out.println("number is less than 5");
        } else {
            System.out.println("number == 5");
        }

        // EXAMPLE 3
        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (currentTemp < favoriteTemp - 30) {
            opinion = "it's pretty cold";
        } else if (currentTemp < favoriteTemp - 20) {
            opinion = "it's a bit cool";
        } else if (currentTemp > favoriteTemp + 10) {
            opinion = "it's a bit too hot out";
        } else {
            opinion = "it's a beautiful day!";
        }
        System.out.println("opinion = " + opinion);

        // switch statements evaluate expressions for value.
        int month = 6;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "not a valid month";
                break;
        }
        System.out.println("monthString = " + monthString);


    }

}
