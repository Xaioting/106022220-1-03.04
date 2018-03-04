import java.util.*;
public class java5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=1,k=1;
        while (n<=15){
            if(n%2>0)
                k=k*n;
            n=n+1;
        }
        System.out.print(k);
    }
}