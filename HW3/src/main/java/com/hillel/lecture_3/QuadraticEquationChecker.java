package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {


    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
            if(a == 0) {
                result = "The 'a' coefficient should not be zero!";
            } else if((Math.sqrt(b * b - 4 * a * c)) < 0) {
                result = "No roots on the set of real numbers!";
            }
        return result;
    }

}
