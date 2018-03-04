import java.util.*;
public class java9one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0,k=1;
       int i=in.nextInt();
       while(k<=i)
       {
        if(k%2==0)
            a=a+k;
        k=k+1;
       }
       if(i%2>0)
           a=a+i;
      System.out.print(a);
    }
}