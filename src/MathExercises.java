import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MathExercises {
    public static void main(String[] args) {

        double x = 20.15;

        double result = Math.pow(1.1, -x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - (3.0/8.0); // as an example #9
        System.out.println(result);

        //eleven
        double resultEleven = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * 1/((Math.cbrt(Math.pow(x, 2)) + 1/7));
                System.out.println(resultEleven);

        //twelve
        double resultTwelve = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2D) * 1 / (2 + Math.exp(-x)) + Math.cbrt(2/x);
        System.out.println(resultTwelve);

        //fourteen
        double resultFourteen = (Math.sqrt(Math.pow(Math.sin(x/2), 3)) + Math.cbrt(Math.exp(1.3 * x) + Math.exp(-1.3 * x))) * 1/(Math.abs(x + 5.0/2.0));
        System.out.println(resultFourteen);

        //sixteen
        double resultSixteen = Math.cbrt((Math.exp(2 * x)) * Math.sqrt(x) - (x + 1.0/3.0)/x) * Math.abs(Math.cos(2.5 * x));
                System.out.println(resultSixteen);
                
        //seventeen
        double resultSeventeen = Math.pow(x, 3)/3 - Math.exp(x) * Math.log(Math.abs(Math.pow(1.3 , 3) + Math.pow(x, 3))) + 4.0/3.0;
                System.out.println(resultSeventeen);
    }
}
