import java.util.Scanner;

public class Odd_digit_count_between_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int num=in.nextInt();
        int count=0;
        int odd_count=0;

        for ( int i =1 ; i<=num; i++){
            while (i !=0){
                i= i/10;
                count++;
            }
            if (count % 2 == 1) {
                odd_count++;

            }

        }
        System.out.println(odd_count);
    }
}
