package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {


    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double d = 2 * Math.sqrt(circleArea / Math.PI); // диаметр круга
        double diag = Math.sqrt(2 * squareArea); // диагональ
        if(diag < d) {
            System.out.println("The square is in the circle");
            result = "The square is in the circle";
        }
        else {
                result = "The square is not in the circle";
            }
        return result;
    }

    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        return result;
    }

}
