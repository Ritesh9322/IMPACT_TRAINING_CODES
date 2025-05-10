//public class reverse_the_number{
//    public static void main(String[] args) {
//        int n = 235934;
//        int original = n;
//        int ans = 0;
//
//        while (n > 0) {
//            int rem = n % 10;  // Get last digit
//            n /= 10;           // Remove last digit
//            ans = ans * 10 + rem;  // Build reversed number
//        }
//
//        if(original == ans ){
//            System.out.println("its palindrome");
//        }else{
//            System.out.println("its not palindrome");
//        }
//
//        System.out.println(ans);
//    }
//}

//import java.util.Scanner;

public class reverse_the_number{
    public static void main(String[] args) {
        int num = 529;

        int last= num%10;
        int middle=(num/10)%10;
        int first =(num/100);

        //System.out.println("reversed digit" +last +middle +first);
        int digit=((last*100)+(middle*10)+first);
        System.out.println(digit);

        }

    }

