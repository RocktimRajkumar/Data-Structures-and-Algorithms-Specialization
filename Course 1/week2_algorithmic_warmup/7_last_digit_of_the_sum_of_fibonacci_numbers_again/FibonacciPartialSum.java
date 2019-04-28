import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }

    private static long getFibonacciPartialSumFast(long from,long to){
        if(to==0)
        return 0;
        long start=(from)%60;
        long end=(to+1)%60;

        long f1=0;
        long f2=1;
        long f=0;
        long ff=1;
        for(int i=0;i<start-2;i++){
            ff=(f1+f2)%10;
            f1=f2;
            f2=ff;
        }
        if(start<2){
            start=2;
            f=1;
        }
        if(end==0)
            return 0;
        for(long i=start;i<end;i++){
            
           
            long temp=f1;
            f1=f2;
            f2=(temp+f2)%10;
            f=(f+f2)%10;
        }

        return f;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        // System.out.println(getFibonacciPartialSumNaive(from, to));
        System.out.println(getFibonacciPartialSumFast(from, to));
    }
}

