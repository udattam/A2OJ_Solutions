import java.util.Scanner;

public class VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        if(n<=m && n<=k)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
