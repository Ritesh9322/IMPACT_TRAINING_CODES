import java.util.Scanner;

public class Even_odd_digit_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int num=in.nextInt();
        int even_sum= 0;
        int odd_sum=0;
        int count=0;

        while (num != 0){
            int rem= num%10;
            if (rem%2==0){
                even_sum+=rem;
            }else {
                odd_sum+=rem;
            }
            num/=10;
        }
        System.out.println(even_sum);
        System.out.println(odd_sum);

    }
}
