package Practice_problem_2;
import java.util.Scanner;

public class LeapYear {
    public void  leapyear(int year) {
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }

        public static void main(String[] args) {
            LeapYear LY = new LeapYear();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            LY.leapyear(year);




        }
    }

