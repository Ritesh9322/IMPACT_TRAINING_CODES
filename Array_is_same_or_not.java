import java.util.Scanner;

public class Array_is_same_or_not {
    public static void main(String[] args) {

        System.out.println("enter array size 1");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("enter array size 2");
        int num2 = in.nextInt();
        int arr1[] = new int[num1];


        System.out.println("add elements for 1st array");
        for (int i = 0; i < num1; i++) {
            arr1[i] = in.nextInt();
        }

        int arr2[] = new int[num2];
        System.out.println("add elements for 2nd array ");
        for (int i = 0; i < num2; i++) {
            arr2[i] = in.nextInt();
        }
        if (num1!=num2){
            System.out.println("arrays are not same");
            return;
        }


        int sum1=0;
        int sum2= 0;

        for (int i=0; i<num1;i++){
            sum1=arr1[i]+sum1;

        }

        for (int i=0; i<num2;i++){
            sum2=arr2[i]+sum2;

        }
        if ( sum1==sum2){
            System.out.println("same");
        }else {
            System.out.println("Not Same");
        }

    }
}
