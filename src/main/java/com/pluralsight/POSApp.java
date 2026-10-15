package com.pluralsight;

import java.util.Scanner;

public class POSApp {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter sandwich size (Please enter Regular or Large):");
        String size = myScanner.nextLine();
        System.out.print("Enter your age:");
        int age = myScanner.nextInt();

        double regularBasePrice = 5.45;
        double largeBasePrice = 8.95;

        if(size.toLowerCase().equals("regular") && age <= 17){
            double discountAmount = regularBasePrice * .10;
            double price = regularBasePrice - discountAmount;
        } else if(size.toLowerCase().equals("regular") && age >= 65){
            double discountAmount = regularBasePrice * .20;
            double price = regularBasePrice - discountAmount;
        } else if (size.toLowerCase().equals("large") && age <=17) {
            double discountAmount = largeBasePrice * .10;
            double price = largeBasePrice - discountAmount;
        } else if(size.toLowerCase().equals("large") && age >= 65){
            double discountAmount = largeBasePrice * .10;
            double price = largeBasePrice - discountAmount;

    }
}
