package operations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    static Scanner scanner = new Scanner(System.in);

    public static  String checkString(String s) {
        while(s.isEmpty() || s.matches(".*\\d.*")) {
            System.out.println("Invalid input.Please type only letters.");
            s = scanner.nextLine();
        }
        return s;
    }

    public static int tuitionCheck(int n) {
        while((n < 0) || (n > 1000)) {
            System.out.println("Invalid input.Choose between 0--1000.");
            n = scanner.nextInt();
        }
        return n;
    }

    public static int oralMarkCheck(int n) {
        while((n < 0) || (n > 20)) {
            System.out.println("Invalid input.Choose between 0--20.");
            n = scanner.nextInt();
        }
        return n;
    }

    public static int totalMarkCheck(int n) {
        while((n < 0) || (n > 100)) {
            System.out.println("Invalid input.Choose between 0--100");
            n = scanner.nextInt();
        }
        return n;
    }

    public static LocalDate convertToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date,formatter);
        return localDate;
    }

    static boolean isDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate.parse(date , formatter);
        } catch (java.time.format.DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public static String checkDate(String date) {
        if(isDate(date)){
            return date;
        }else {
            System.out.println("Invalid date format.Provide correct values.");
            return checkDate(scanner.next());
        }
    }

    public static int check_size_of_list(int n, ArrayList list) {
        if (n <= list.size() && n > 0) {
            return n;
        }else
        {
            System.out.println("Invalid number.Try a smaller one");
            return check_size_of_list(scanner.nextInt(), list);
        }
    }
}
