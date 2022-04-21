import java.util.Scanner;

public class NastyaIsReadingABook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[2*n];
        for(int i=0;i<2*n;i++){
            input[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int idx=0;
        while(input[idx]<k)
            idx++;
        int ans=0;
        if(idx%2==0)
            ans=n-idx/2;
        else
            ans=n-(idx-1)/2;
        System.out.println(ans);
    }
}