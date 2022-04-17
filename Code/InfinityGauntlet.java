import java.util.HashSet;
import java.util.Scanner;

public class InfinityGauntlet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=6-n;
        HashSet<String> set=new HashSet<>();
        String[] all={"Time","Mind","Soul","Power","Reality","Space"};
        String[] color={"green","yellow","orange","purple","red","blue"};
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        System.out.println(rem);
        for(int i=0;i<6;i++){
            if(!set.contains(color[i]))
                System.out.println(all[i]);
        }
    }
}
