package Assignment.Assignment4;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("input number of books bought");
        int a = sc.nextInt();
        int d = 30;
        switch (a){
            case 0:
                System.out.println("0 points");
            case 1:
                System.out.println("5 points");
                break;
            case 2:
                System.out.println("15 points");
                break;
            case 3:
                System.out.println("30 points");
                break;
            case 4, 999999999:
                System.out.println("60 points");
                break;

        }







    }
}
