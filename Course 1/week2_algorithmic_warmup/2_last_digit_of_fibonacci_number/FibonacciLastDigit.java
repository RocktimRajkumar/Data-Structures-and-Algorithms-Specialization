import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
	
	private static int getFibonacciLastDigitFast(int n){
		if(n<=1)
			return n;
		int []arr=new int[n];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++){
			arr[i]=(arr[i-1]+arr[i-2])%10;
		}
		return (arr[n-1]+arr[n-2])%10;
		
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}


