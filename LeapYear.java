import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int year;

        while (true) {
            System.out.print("Enter any year (0 or negative to exit): ");
            year = s.nextInt();

            if (year <= 0) {
                System.out.println("Exiting the program.");
                break;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        s.close();
    }
}
