import java.util.Scanner;

public class PensAndPencils {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[][] ans=new int[t][];
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int k=sc.nextInt();
            int pens=a/c;
            int pencil=b/d;
            int rem=a%c;
            if(rem!=0)
                pens+=1;
            rem=b%d;
            if(rem!=0)
                pencil+=1;
            if(pens+pencil<=k)
                ans[i]=(new int[]{pens,pencil});
            else
                ans[i]=(new int[]{-1});
        }
        for(int i=0;i<ans.length;i++){
            for(int el: ans[i]){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
