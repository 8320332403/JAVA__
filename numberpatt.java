import java.util.*;
public class numberpatt {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            int number=1;
            for(int j =1;j<=(2*i-1);j++ ) {
                if(j==1||j==(2*i-1)) {
                    System.out.print("1");
                }else {
                    System.out.print(j-1);
                }

            }
            System.out.println();
        }
    }
}