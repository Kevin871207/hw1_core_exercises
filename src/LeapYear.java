import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();

        leapYear(userInput);
    }

    public static void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(String.format("%d is a leap year", year));
            } else {
                if (year % 400 != 0) {
                    System.out.println(String.format("%d is not a leap year", year));
                } else {
                    System.out.println(String.format("%d is a leap year", year));
                }
            }
        } else {
            System.out.println(String.format("%d is not a leap year", year));
        }
    }
}
