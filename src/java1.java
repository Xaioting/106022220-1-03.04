import java.util.*;
public class java1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.next();
        int n;
        int k=0;
        while(k<str.length()) {
            n=(int)str.charAt(k)-'0';
            if (n==7)
                System.out.print(n);
            k++;
        }

    }
}