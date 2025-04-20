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
    }
}
