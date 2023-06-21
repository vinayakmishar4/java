package Hackerrank;

import java.time.LocalDate;
import java.util.Scanner;

public class DateandTime
{
   public static String findDay(int month, int day, int year) 
    {
       LocalDate date =LocalDate.of(year, month,day);
       return date.getDayOfWeek().toString();   
    }
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter The Day");
      int day=scanner.nextInt();
      System.out.println("Enter the Month");
      int month=scanner.nextInt();
      System.out.println("Enter the Year");
      int year=scanner.nextInt();
      System.out.println(findDay(month, day, year));
   } 
}
