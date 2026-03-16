
 
package com.mycompany.ice.activity2.st10514561;


public class StudentUtility {
    
    // 1.Calculate Average
    public static double calculateAverage(double num1, double num2, double num3, double num4){
        return (num1 + num2 + num3 + num4);
    }
    //2. Convert Minutes To Seconds
    public static int convertMinutesToSeconds(int minutes){
        return minutes * 60;
    }
    //3.Get Full Name
    public static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    //4.Is a multiple of 5
    public static boolean isMultipleOfFive(int number){
        return number % 5 ==0;
    }
    
}
