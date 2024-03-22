import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
           TODO: ( mai and mohamed)
             - using scanner just one
         */
        System.out.println(getNameDay(scanner));
        System.out.println(getNameMonth(scanner));
    }//main

    /*
         TODO: (Mai)
           - create method  called  (getNameMonth)  return month
           - read number month from user (Scanner)
           - condition using  switch
           - return method String
       */
    public static String getNameMonth(Scanner scanner) {

        System.out.printf("enter month 1 to 12:");
        int numberMonth = scanner.nextInt();
        return switch (numberMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid value";
        };

    } // getNameMonth

    /*
           TODO: (Mohamed)
               - create method (getNameDay) return day
               - read number day form user (Scanner)
               - condition using  switch
               - return method String
         */

    public static String getNameDay(Scanner scanner) {

        System.out.printf("enter number 1 to 7:");
        int numberDay = scanner.nextInt();

        return switch (numberDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Value";
        };

    }

}// class
