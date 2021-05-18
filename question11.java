package Assignment.Assignment4;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        // time = distance/n //
        Scanner sc = new Scanner (System.in);
        int air = 1100;
        int water = 4900;
        int steel = 16400;
        System.out.println("Enter the medium: 'Air' or 'Water' or 'Steel' ");
        String a = sc.next();
        System.out.println("enter distance in feet");
        double b = sc.nextDouble();
        if (a.equalsIgnoreCase("air")){
            System.out.println((b / air) + " seconds");
        }else if (a.equalsIgnoreCase("water")){
            System.out.println(b/water + " seconds");
        }else if (a.equalsIgnoreCase("steel")){
            System.out.println( b/steel + " seconds");
        }else {
            System.err.println("invalid");
        }














    }
}
