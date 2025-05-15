import java.util.Scanner;

public class Bit_manupulation_decimal_to_binary {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
         int num=in.nextInt();
         int rev=0;
         int place=1;

         while (num>0){
             int rem= num%2;
             rev+= rem*place;
             place*=10;
             num/=2;
         }
        System.out.println(rev);
    }
}
