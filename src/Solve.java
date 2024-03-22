import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {


        /*
           TODO: (Mohamed)
               - create method (getNameDay) return day
               - read number day form user (Scanner)
               - condition using  switch
               - return method String
         */
    }//main

    /*
         TODO: (Mai)
           - create method  called  (getNameMonth)  return month
           - read number month from user (Scanner)
           - condition using  switch
           - return method String
       */
    public static String getNameMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter month 1 to 12");
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


}// class
