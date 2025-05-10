import java.util.Scanner;

public class Array_subtraction {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = new int[num];

        System.out.println("enter elements");
        for (int i=0;i<num;i++){
            arr[i]= in.nextInt();

        }
        int sum=0;
        System.out.println("elements in array:");
        for (int i=0; i<num;i++){
            sum=arr[i]+sum;
            System.out.println(arr[i]+" ");
        }
        System.out.println("sum:"+sum);
    }
}
