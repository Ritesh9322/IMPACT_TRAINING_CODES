import java.util.Scanner;

public class Treasure_hunter_hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 digit trasure amount");
        int total = in.nextInt();

        System.out.println("enter ben percent");
        int ben_coins =in.nextInt();

        System.out.println("enter blacks percent");
        int black_coins =in.nextInt();

        int ben1=(ben_coins /total)*100;
        int rem= total-ben1;
        int black1=(black_coins/rem)*100;
        int rem2= rem-black1;
        int share_of_pirates=rem2/3;


        System.out.println(ben1);
        System.out.println(black1);
        System.out.println(share_of_pirates);
    }

}

