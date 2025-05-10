import java.util.Scanner;

public class Reverse_no {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the  no:");
            int n=in.nextInt();
            int reverse=0;
            int count=0;

            while (n>0){
                int rem=n%10;
                n=n/10;
                reverse=reverse*10+rem;

            }
            System.out.println(reverse);






    }
}
