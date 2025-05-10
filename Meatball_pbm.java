import java.util.Scanner;

public class Meatball_pbm {
    public static void main(String[] args) {
        System.out.println("enter 3digit  no:");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        int num1= num/10;
        int num2= num1%10;

        if (num2 % 3 ==0){
            System.out.println("trendy");
        }else {
            System.out.println("not trendy");
        }
    }
}
