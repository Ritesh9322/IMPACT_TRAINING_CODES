import java.util.Scanner;

public class Array_declaration {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = new int[num];

        System.out.println("add elements");
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        for (int i=0;i<num; i++){
            System.out.println(arr[i]+" ");
        }

    }

}
