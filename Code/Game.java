import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++)
            m[i]=sc.nextInt();
        Arrays.sort(m);
        if(n%2==0)
            System.out.println(m[n/2-1]);
        else
            System.out.println(m[n/2]);
    }
}
