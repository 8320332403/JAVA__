import java.util.*;
public class Pattern7vit {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");

            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print(j);
            }
            for(int j=n;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
    