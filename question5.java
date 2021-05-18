package Assignment.Assignment4;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input date");
        System.out.println("like this:10 then:june then:2021");
        System.out.println("day");
        int a = sc.nextInt();
        System.out.println("month");
        String b = sc.next();
        System.out.println("year");
        String c = sc.next();
        String d = c.substring(2);
        int h = Integer. parseInt(d);
        int e = Integer. parseInt(c);
        int f = 0;
        if (b.equalsIgnoreCase("january")){
             f = 1;
        }else if(b.equalsIgnoreCase("February")){
             f = 2;
        }else if(b.equalsIgnoreCase("march")){
            f = 3;
        }else if (b.equalsIgnoreCase("april")){
            f = 4;
        }else if(b.equalsIgnoreCase("may")){
            f = 5;
        }else if(b.equalsIgnoreCase("june")){
            f = 6;
        }else if(b.equalsIgnoreCase("july")){
            f = 7;
        }else if(b.equalsIgnoreCase("august")){
            f = 8;
        }else if(b.equalsIgnoreCase("september")){
            f = 9;
        }else if(b.equalsIgnoreCase("october")){
            f = 10;
        }else if(b.equalsIgnoreCase("november")){
            f = 11;
        }else if(b.equalsIgnoreCase("december")){
            f = 12;
        }else{
            System.out.println("SYSTEM ERROR:");
            System.err.println("INVALID!!!!");
        }
        System.out.println(a+"/"+f+"/"+h);
        if (a * f == h){
            System.out.println("this date is MAGIC!!");
        }else{
            System.out.println("this date is not magic");
        }




    }
}
