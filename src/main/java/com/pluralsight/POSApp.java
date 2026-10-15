package com.pluralsight;

import java.util.Scanner;

public class POSApp {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter sandwich size (Please enter Regular or Large):");
        String size = myScanner.nextLine();
        //while (size.toLowerCase() = " " || !size.toLowerCase().equals("large") || ("regular")){
        //     System.out.print("Please enter Regular or Large: ");
       // }
        System.out.print("Enter your age:");
        int age = myScanner.nextInt();

        double regularBasePrice = 5.45;
        double largeBasePrice = 8.95;
        double price;



        if(size.toLowerCase().equals("regular") && age <= 17){
            double discountAmount = regularBasePrice * .10;
            price = regularBasePrice - discountAmount;
        } else if(size.toLowerCase().equals("regular") && age >= 65){
            double discountAmount = regularBasePrice * .20;
            price = regularBasePrice - discountAmount;
        } else if (size.toLowerCase().equals("large") && age <=17) {
            double discountAmount = largeBasePrice * .10;
            price = largeBasePrice - discountAmount;
        } else if(size.toLowerCase().equals("large") && age >= 65) {
            double discountAmount = largeBasePrice * .10;
            price = largeBasePrice - discountAmount;
        } else if(size.toLowerCase().equals("regular")){
            price = regularBasePrice;
        }else{
            price = largeBasePrice;
        }
    System.out.printf("Total: %.2f", price);
    }
}
