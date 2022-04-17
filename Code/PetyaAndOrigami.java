import java.util.Scanner;

public class PetyaAndOrigami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long red=(n*2/k);
        long green=(n*5/k);
        long blue=(n*8/k);
        if((n*2)%k!=0)
            red++;
        if((n*5)%k!=0)
            green++;
        if((n*8)%k!=0)
            blue++;
        System.out.println((red+blue+green));
    }
}
