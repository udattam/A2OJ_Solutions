import java.util.Scanner;

public class TheRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rank=1,thomas=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                int m=sc.nextInt();
                sum+=m;
            }
            if(i==0)
                thomas=sum;
            if(sum>thomas)
                rank++;
        }
        System.out.println(rank);
    }
}
