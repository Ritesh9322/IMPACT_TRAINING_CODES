import java.util.Scanner;

public class Star_pattarn2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the star no:");
            int num=in.nextInt();
//
//            for (int i =1; i<=num;i++) {
//                for (int j = num; j >= i; j--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }
//
 // another approach
            for (int i =0; i<=num;i++) {
                for (int j = 0; j < (num - i); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


            }
    }

    //another approach




