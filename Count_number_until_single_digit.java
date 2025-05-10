import java.util.Scanner;

public class Count_number_until_single_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 no:");
        int n=in.nextInt();
        int sum =0;

            while (n!=0){
                int rem=n%10;
                sum=rem+sum;
                n=n/10;

                if (sum >=10 && n==0){
                    n=sum;
                    sum=0;

            }


        }
        System.out.println(sum);

    }

}
