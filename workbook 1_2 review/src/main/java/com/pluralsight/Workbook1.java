package com.pluralsight;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Workbook1 {
    public static void main(String[] args) {

//        double number = 5.14;;
//
//        System.out.println(Math.round(number));
//        String name1 = "bob";
//        String name2 = "Bob";


//        System.out.println(name1.equals(name2));

//        System.out.println(name1.equalsIgnoreCase(name2));
        //CONVERTS STRING TO INTEGER
        int number = Integer.parseInt("123");
        System.out.println(number);
        //CONVERTS STRING INTO FLOAT
        float value = Float.parseFloat("12.22");
        System.out.println(value);

        //local date formatter and import in package before class
//                - `d` - day (1-31)
//                - `dd` - day with leading zero (01-31)
//                - `M` - month (1-12)
//                - `MM` - month with leading zero (01-12)
//                - `MMM` - abbreviated month name (Jan)
//                - `MMMM` - full month name (January)
//                - `yy` - 2-digit year
//                - `yyyy` - 4-digit year
        LocalDate date1 = LocalDate.parse("2022-11-22");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.parse("05/15/2023", formatter);
        System.out.println(date2);

        StringBuilder mongus = new StringBuilder();
        for (int i = 0; i < 21; i++) {
            //first append creates the list, 2nd append numbers list, third append adds commas for organization
            mongus.append("Item ").append(i).append(", ");
        }
        String message = mongus.toString();

        System.out.println(mongus);

        String[] names = {"Alice", "Bob", "Charlie"};
        int[] scores = new int[10];// Creates array with 10 elements (all 0)// Iterating with regular for loop (when index matters)
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }

}
