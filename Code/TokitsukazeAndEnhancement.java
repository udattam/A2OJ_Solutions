import java.util.Scanner;

public class TokitsukazeAndEnhancement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rem=x%4;
        if(rem==1)
            System.out.println(0+" A");
        else if(rem==2)
            System.out.println(1+" B");
        else if(rem==3)
            System.out.println(2+" A");
        else
            System.out.println(1+" A");
    }
}
