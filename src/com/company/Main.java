package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int count;
	System.out.println("Tax Calculator App");
	System.out.println("----WELCOME----");
	System.out.println("Enter total person count:");
    count= scanner.nextInt();
    String[] names= new String[count];
    long[] income= new long[count];
    for (int i =0; i<count; i++){
        System.out.println("Enter name"+(i+1)+":");
        names[i]=scanner.nextLine();
        System.out.println(names[i]);
        System.out.println("Enter"+names[i]+"'s Annual Income:");
        income[i]=scanner.nextLong();
        System.out.println(income[i]);
    }

    scanner.close();
        System.out.println(" Names with liable taxes");
        System.out.println("---------------------------");

        for (int i = 0; i < count; i++) {
            calculateTax(names[i], income[i]);
        }
    }
    private static void calculateTax(String names, long income) {

        long tax;

        if (income >= 300000) {
            tax = income * 20 / 100;
        } else if (income >= 100000) {
            tax = income * 10 / 100;
        } else {
            tax = 0;
        }

        System.out.println(" " + names +" : "+ '\u20B9' + " " + tax);
    }



}
