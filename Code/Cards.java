import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int zero=0,one=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='z')
                zero++;
            if(str.charAt(i)=='n')
                one++;
        }
        while(one>0){
            System.out.print(1+" ");
            one--;
        }
        while(zero>0) {
            System.out.print(0 + " ");
            zero--;
        }
    }
}
