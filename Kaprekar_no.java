import java.util.Scanner;

public class Kaprekar_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int num=in.nextInt();


        int count=0;
        int temp=num;


        int sqrd_no= num*num;

        while (num>0){
            num/=10;
            count++;
        }
        int power= (int) Math.pow(10,count);

        int right= sqrd_no%power;
        int left = sqrd_no%power;

        if (left+right==temp){
            System.out.println("Kaprekar Number");
        }else{
            System.out.println("Not Kaprekar number");
        }

    }
}
