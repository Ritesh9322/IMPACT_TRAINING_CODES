import java.util.Scanner;

public class Room_rent_tarrif_pbm_hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month No:");
        int month=in.nextInt();

        System.out.println("enter room rent per day:");
        int rent_per_day= in.nextInt();

        System.out.println("Enter total booking days:");
        int stayed_days = in.nextInt();

        int season_pricing = (20 * rent_per_day) / 100;

        if (month == 4 || month == 5 || month == 6 || month==11 || month == 12){
            System.out.println((rent_per_day + season_pricing)*stayed_days);
        }
        else if (month > 12){
            System.out.println("Invalid Input");
        } else {
            System.out.println(rent_per_day * stayed_days);
        }

    }
}
