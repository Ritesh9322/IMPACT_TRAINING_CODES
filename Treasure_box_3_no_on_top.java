import java.util.Scanner;

public class Treasure_box_3_no_on_top {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st No:");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd no:");
        int num2 = in.nextInt();
        System.out.println("Enter 3rd No");
        int num3 = in.nextInt();

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }


        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        int middle= (num1 + num2 + num3) - (max + min);


        int gcd= 1;
        int temp1 = num1;
        int temp2= num2;
        int temp3 =num3;


        int min1;
        if (temp1 < temp2) {
            min1= temp1;
        } else {
            min1 = temp2;
        }

        for (int i = 1; i <= min1; i++) {
            if (temp1 % i == 0 && temp2 % i == 0) {
                gcd= i;
            }
        }

        int min2;
        if (gcd < temp3) {
            min2 = gcd;
        } else {
            min2= temp3;
        }

        int finalGCD = 1;
        for (int i= 1; i<= min2; i++) {
            if (gcd % i == 0 && temp3 % i == 0) {
                finalGCD = i;
            }
        }

        System.out.println("The treasure is in the box which has the number: " + middle);
        System.out.println("The code to open the box is: " + finalGCD);


    }
}

// another way to solve the pbm


// import java.util.*;
//
//public class gcd{
//
//    public static int findGCD(int a,int b){
//        while (b != 0) {
//            int temp=b;
//            b = a%b;
//            a=temp;
//
//        }
//        return a;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a  = sc.nextInt();
//        int b  = sc.nextInt();
//        int c  = sc.nextInt();
//
//        int finalGCD= findGCD(findGCD(a,b),c);
//        System.out.println(finalGCD);
//    }
//}

