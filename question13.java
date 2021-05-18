package Assignment.Assignment4;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of checks given out for the month");
        int a = sc.nextInt();
        if (a < 20){
            System.out.println("your fee:\n$10");
        }else if(a >=20 && a == 39){
            System.out.println("your fee:\n$0.8");
        }else if(a >= 40 && a == 59){
            System.out.println("your fee:\n$0.6");
        }else if(a >= 60 ){
            System.out.println("your fee:\n$0.4");
        }else{
            System.err.println("!!!invalid");
        }










    }
}
