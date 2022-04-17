import java.util.Scanner;

public class BetweenTheOffices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int flight=0,train=0;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)=='S'&& str.charAt(i+1)=='F')
                flight++;
            if(str.charAt(i)=='F'&& str.charAt(i+1)=='S')
                train++;
        }
        if(flight>train)
            System.out.println("YES");
        else
            System.out.printf("NO");
    }
}
