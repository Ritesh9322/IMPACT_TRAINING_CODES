import java.util.Scanner;

public class Adam_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int num=in.nextInt();

        int reverse=0;

         int sqd_num=num*num;

        while (num>0){
            int rem=num%10;
            num=num/10;
            reverse=reverse*10+rem;

        }

        int sqd_sqd_reversed_no=0;
        int reversed_sqd_no=reverse*reverse;

        while (reversed_sqd_no>0){
            int rem1 =reversed_sqd_no%10;
            reversed_sqd_no=reversed_sqd_no/10;
            sqd_sqd_reversed_no=sqd_sqd_reversed_no*10+ rem1;

        }

        if ( sqd_num == sqd_sqd_reversed_no){
            System.out.println("its adam no");
        }else {
            System.out.println("its not adam no");
        }


    }
}
