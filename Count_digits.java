public class Count_digits  {
    public static void main(String[] args) {
        int n = 86662256;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            if (rem == 6){
                sum++;
            }
            n = n/10;// we can also write n/=10
        }
        System.out.println(sum);
    }
}
