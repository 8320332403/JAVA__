import java.util.*;
public class Sarthak123 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int count=0;
        while(n>0) {
            n=n/10;
            count++;
        }System.out.println(count);
    }
}