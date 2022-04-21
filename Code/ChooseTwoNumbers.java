import java.util.Arrays;
import java.util.Scanner;

public class ChooseTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] narr=new int[n];
        for(int i=0;i<n;i++)
            narr[i]=sc.nextInt();
        Arrays.sort(narr);
        int m=sc.nextInt();
        int[] marr=new int[m];
        for(int i=0;i<m;i++)
            marr[i]=sc.nextInt();
        Arrays.sort(marr);
        System.out.println(narr[narr.length-1]+" "+marr[marr.length-1]);
    }
}
