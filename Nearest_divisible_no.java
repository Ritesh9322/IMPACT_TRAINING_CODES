import java.util.Scanner;

public class Nearest_divisible_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("num");
        int num=in.nextInt();

        System.out.println("m");
        int m=in.nextInt();
        int q=num/m;

        int lb= q*m;
        int ub=(q+1)*m;

        int dist1= num-lb;
        int dist2= ub-num;

        if (dist1 >= dist2){
            System.out.println(ub);
        } else if (dist1<dist2) {
            System.out.println(lb);
        }
    }
}
