package com.polina.bmicalc;

import java.util.Scanner;

public class bmicalc {public static void main(String[] args) throws Exception {
    calculateBMI();
}

    private static void calculateBMI() throws Exception {

        System.out.print("Hello, buddy, give me your weight in kilograms please: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        while(weight<30 || weight > 270){
            System.out.println("C`mon, enter your weight in value between 30 and 270!Let`s try again!");
            weight = s.nextFloat();
        }


        System.out.print("And now let my AI see  your height in cm: ");
        float height = s.nextFloat();
        while (height < 100.0 || height > 300.0) {
            System.out.println("C`mon, enter your height in value between 100 and 300!Let`s try again!");
            height = s.nextFloat();
        }


        float bmi = (100 * 100 * weight) / (height * height);
        System.out.println("Your BMI is: " + bmi);
        printBMICategory(bmi);



        System.out.println("Do it again? (1/0)");
        Float replay = s.nextFloat();
        while (replay == 1) {
            calculateBMI();
            break;
        }
        }

















    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("Oh no! You are super underweight!");
        }else if (bmi < 25) {
            System.out.println("Thanks God you are alright!");
        }else if (bmi < 30) {
            System.out.println("You really need some Chloe Ting workout,dude");
        }else {
            System.out.println("Go to the doctor, you are obese,darling");
        }
    }
}



