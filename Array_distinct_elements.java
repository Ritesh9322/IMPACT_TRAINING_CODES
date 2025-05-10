import java.util.Scanner;
//array must be sorted if you want to  to run this properly

public class Array_distinct_elements {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int []arr = new int[num];
        int count=1;

        System.out.println("enter elements");
        for (int i=0;i<num;i++){
            arr[i]= in.nextInt();

        }

        for (int i=0;i<num-1;i++) {
        if (arr[i] != arr[i+1])
            count++;
        }
        System.out.println("Count of the distict elements is:"+count);
    }
}
