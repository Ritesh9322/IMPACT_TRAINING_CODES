//import java.util.Scanner;
//
//public class Special_numbers {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num1=in.nextInt();
//        int num2= in.nextInt();
//
//
//
//
//        for(int i = num1 ; i <= num2 ; i++){
//            if (i<= num2){
//                int last_digit= i%10;
//                int first_digit= last_digit/10;
//                int special=(last_digit+first_digit)+(first_digit*last_digit);
//                if (special == i);{
//                    System.out.println("i");
//                }
//            }
//
//        }
//    }
//}
//
import java.util.Scanner;

public class Special_numbers {
    public static void main(String[] args) {
        System.out.println("enter 2 numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            int num = i;
            int last_digit = num % 10;

            // To find the first digit
            int first_digit = num;
            while (first_digit >= 10) {
                first_digit /= 10;
            }

            int special = (last_digit + first_digit) + (first_digit * last_digit);

            if (special == i) {
                System.out.println(i);
            }
        }
    }
}
