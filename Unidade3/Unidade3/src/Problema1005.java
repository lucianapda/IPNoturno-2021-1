package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema1005 {
    public static void main(String[] args) {
        
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        Scanner sc = new Scanner(System.in);
            
          /*  double a, b, media;
            
            a = sc.nextDouble();
            b = sc.nextDouble();
            
            media = ((3.5 * a) + (7.5 * b))/11;
            
            System.out.println("MEDIA = " +  decimalFormat.format(media));

            */

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            System.out.println(n1 + " " + n2 + "  " + n3);
            System.out.println(n2);
    }
}
