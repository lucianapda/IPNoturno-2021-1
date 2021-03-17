package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema1002 {
    public static void main(String[] args) {
        //area = π . raio2.
        //"A=" -- 4 casas
        //π = 3.14159

        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        Scanner s = new Scanner(System.in);
        /* 
        double pi = 3.14159;
        double raio = s.nextDouble();

        //double area = pi * raio * raio;
        double area = pi * Math.pow(raio, 2);

        System.out.println("A=" + decimalFormat.format(area));
        */

        double raio = s.nextDouble();
        System.out.println("A=" + 
            decimalFormat.format((3.14159 * Math.pow(raio, 2))));

        s.close();
        
    }
}
