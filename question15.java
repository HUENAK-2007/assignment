package Assignment.Assignment4;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int a = sc.nextInt();
        switch (a) {
            case 1, 2:
                System.out.println("low number");
                break;
            case 3, 5:
                System.out.println("mideum number");
                break;
            case 6, 999999999:
                System.out.println("other number");
                break;
        }









    }
}
