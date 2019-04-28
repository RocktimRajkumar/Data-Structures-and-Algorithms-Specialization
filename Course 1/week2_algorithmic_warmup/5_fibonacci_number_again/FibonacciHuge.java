import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }

    private static long getFibonacciHugeFast(long n,long m){
        long previous  = 0;
        long current   = 1;
        long i=0;
        for(i=0;i<m*m;i++){
            long temp_previous = previous;
            previous = current;
            current = (temp_previous + current)%m;
            if(previous == 0 && current == 1){
                i+=1;
                break;
            }
        }
        long rem=n%i;
        long a1=0;
        long a2=1;
        long a=rem;
        for(int j=0;j<rem-1;j++){
            a=(a1+a2)%m;
            a1=a2;
            a2=a;
        }

        return a%m;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        // System.out.println(getFibonacciHugeNaive(n, m));
        System.out.println(getFibonacciHugeFast(n, m));
    }
}

