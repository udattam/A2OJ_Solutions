import java.util.HashSet;
import java.util.Scanner;

public class Fingerprints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] seq=new int[n];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
            seq[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            set.add(sc.nextInt());
        for(int i=0;i<n;i++)
            if(set.contains(seq[i]))
                System.out.print(seq[i]+" ");
    }
}
