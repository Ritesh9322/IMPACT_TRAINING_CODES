import java.util.Scanner;

public class Star_pattarn5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the star no:");
        int num = in.nextInt();



        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i==0 || i==num-1 || j==num-1 || j==0)

                System.out.print("* ");
            else
                    System.out.print(" ");
                }


            }
            System.out.println();


        }

    }

