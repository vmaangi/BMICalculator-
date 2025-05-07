package day4;

import java.util.Scanner;

public class bmiCalulator {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds");
		
		double weightInPounds = scanner.nextDouble();
		
		System.out.println("Enter your height in meters");
		
		double height = scanner.nextDouble();
		
		//To convert lbs to kgs multiple the value given by 0.453592
		
		double weightInKg = weightInPounds*0.453592;
		
		//BMI = weight (kg) / (height (m))^2
		
		double bmi = weightInKg/(height*height);
		
		System.out.println("Your BMI is "+bmi);
		
		// Interpret BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        
        scanner.close();
		
		

	}

}
