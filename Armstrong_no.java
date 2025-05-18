import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        int num=in.nextInt();

        
        int temp=num;
        int sum=0;
        int count=0;
        

        while (temp!=0){
            temp=temp%10;
            num/=10;
            count++;

        }
        while (temp!=0){
            temp=temp%10;
            num/=10;
            sum=(int)Math.pow(temp,count);


        }
        
        System.out.println(sum);


    }
}
