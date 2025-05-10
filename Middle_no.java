import java.util.Scanner;

public class Middle_no {
    public static void main(String[] args) {
        System.out.println("enter natural no");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();

        int temp=num;
        int count=0;

        while (temp>0){
            temp=temp/10;
            count++;
            }
        if (count % 2==0){
            System.out.println("num is even, cant find exact middle digit");
        }

        int middle_digit_position=(count/2)+1;


        int position=0;
        int middle_digit=0;

        while (num>0){
            int digit= num%10;
            num/=10;
            position++;
            if (middle_digit_position == position){
               middle_digit=digit;
            }

        }
        System.out.println("middle digit is:"+middle_digit);
    }
}





