import java.util.Scanner;

public class Harry_potter {
    public static void main(String[] args) {
        System.out.println("enter a num:");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

       int last_digit = num%10;
       int first = num;
        while (first >= 10){
          first = first/10;


        }
       int  sum = last_digit+first;
        System.out.println("sum is:" +sum);


    }
}
