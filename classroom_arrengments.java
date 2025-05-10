
import java.sql.SQLOutput;
import java.util.Scanner;

public class classroom_arrengments{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter row:");
        int row = in.nextInt();
        System.out.println("enter column:");
        int column = in.nextInt();
        System.out.println("enter seat no:");
        int seat = in.nextInt();

        if (seat <= column) {
            System.out.println("CSE");


        } else if (seat % column ==0) {
            System.out.println("CSE");

        } else if (seat % column == 1) {
            System.out.println("CSE");
        }else {
            System.out.println("ECE");
       }
    }


    }


