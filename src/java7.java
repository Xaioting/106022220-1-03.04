import java.util.*;
public class java7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            break;
        }
            if(i==n)
                System.out.println("是");
            else
            System.out.println("否");
    }
}
