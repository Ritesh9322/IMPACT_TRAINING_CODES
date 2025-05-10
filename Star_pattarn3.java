import java.util.Scanner;
//              *
//             **
//            ***


public class Star_pattarn3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the star no:");
        int num=in.nextInt();

        for (int i =0; i<num;i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int k=0;k<(i+1);k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

