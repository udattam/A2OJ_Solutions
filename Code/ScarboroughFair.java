import java.util.Scanner;

public class ScarboroughFair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        for(int i=1;i<=m;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            char c1=sc.next().charAt(0);
            char c2=sc.next().charAt(0);
            s=s.substring(0,l-1)+s.substring(l-1,r).replace(c1,c2)+s.substring(r);

        }
        System.out.println(s);
    }
}
