import java.util.Scanner;

public class FafaAndHisCompany {
    public static int compute(int n){
            int leader=1;
            int count=0;
            while(leader<=n/2) {
                if ((n - leader) % leader == 0)
                    count++;
                leader++;
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(compute(n));
    }
}
