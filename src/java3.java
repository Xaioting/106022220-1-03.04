import java.util.*;
public class java3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e=1;
        int w,k,i;
        i=1;
        while(i<=9){
            k=1; w=1;
            while (k<=i){
            w=w*k; k=k+1;
        }
            i=i+1;
            e=(e+(1/(double)w));

        }
        System.out.print(e);
    }

}

