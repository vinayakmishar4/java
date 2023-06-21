package Hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class Currency
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you");
        double payment = scanner.nextDouble();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india =NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);   
    }
}
