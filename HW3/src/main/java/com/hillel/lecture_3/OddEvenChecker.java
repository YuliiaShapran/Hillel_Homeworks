package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {


    public String checkNumber(int number) {

//        TODO implements result
        String result = "";
            if ( (number % 2) == 0 ) {
                System.out.println("Even Number");
                result = "Even Number";
            } else {
                System.out.println("Odd Number");
                result = "Odd Number";
            }

        return result;
    }
}
