//import java.util.Scanner;

public class palindrome {

        public static void main(String[] args) {

           // Scanner in = new Scanner(System.in);

            int n = 212;
            int original = n;
            int ans = 0;

            while (n > 0) {
                int rem = n % 10;  // Get last digit
                n /= 10;           // Remove last digit
                ans = ans * 10 + rem;  // Build reversed number
            }

            if(original == ans ){
                System.out.println("its palindrome");
            }else{
                System.out.println("its not palindrome");
            }

            System.out.println(ans);
        }
    }