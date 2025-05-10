import java.util.Scanner;

public class Collatz_pbm {
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int count =0;

        while  (num !=1) {
            if (num % 2 == 0) {
                System.out.println(num / 2);
            } else {
                System.out.println(3 * num + 1);
            }
            count++;
        }


        System.out.println(count);



    }
}
