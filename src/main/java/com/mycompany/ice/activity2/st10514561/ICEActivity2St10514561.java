
package com.mycompany.ice.activity2.st10514561;

import java.util.Scanner;
public class ICEActivity2St10514561 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //1. Calculate Average
        double average = StudentUtility.calculateAverage(5.0, 10.0, 15.0, 20.0);
        System.out.println("Average: " + average);
        
        //2.Convert Minutes To Seconds
        System.out.println("Enter Minutes");
        int Minutes = input.nextInt();
        int Seconds = StudentUtility.convertMinutesToSeconds(Minutes);
        System.out.println(Minutes + " minutes = " + Seconds + "Seconds");
        
        
        //3.Get Full Name 
        System.out.println("Enter first Name: ");
        String firstName = input.next();
        System.out.println("Enter last Name: ");
        String lastName = input.next();
        String fullName = StudentUtility.getFullName(firstName, lastName);
        System.out.println("Full Name:" + fullName);
        
        //3.Value is a multiple of 5
        System.out.println("Enter a number to check if it is a multiple of 5: ");
        int num2 = input.nextInt();
        boolean result2 = StudentUtility.isMultipleOfFive(num2);
        System.out.println(" is multiple of 5? " + result2);
        
         input.close();
    }
}
