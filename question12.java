package Assignment.Assignment4;

import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monthly package type:\na,b or c");
        String a = sc.next();
        System.out.println("Enter omunt of hours spent");
        int b = sc.nextInt();

        if (a.equalsIgnoreCase("a")){
            double c = 9.95;

            if (b > 10){
                int d = (b - 10 );
                double f = (d * 2);
                System.out.println("Your expenses are $" +(c + f ));
            }else if(b == 10){
                System.out.println("your expense is $9.95");
            }else{
                System.err.println("you did not spend enough time \n that is your problem");
                System.out.println("your expense is: $9.95");
            }
        }

        if (a.equalsIgnoreCase("b")){
            double f = 13.95;
            if(b > 20){
                int d = (b - 20);
                System.out.println("your expenses are: $" +(f +d));
            }else if (b == 20){
                System.out.println("your expenses are: $13.95");
            }else{
                System.err.println("you did not spend enough time \n that is your problem");
                System.out.println("your expense is: $13.95");
            }
        }

        if (a.equalsIgnoreCase("c")){
            System.out.println("your expense is: $19.95");
        }











    }
}
