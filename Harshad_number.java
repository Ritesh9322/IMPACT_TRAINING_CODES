import java.util.Scanner;

public class Harshad_number {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter no:");
            int n=in.nextInt();

            while (n!=0) {
                int rem = n % 10;
                n = n / 10;
            }

    }
}
