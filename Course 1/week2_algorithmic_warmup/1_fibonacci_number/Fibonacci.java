import java.util.*;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long calc_fib_fast(int n){
	  if(n<=1)
		  return n;
	  int []arr=new int[n];
	  arr[0]=0;
	  arr[1]=1;
	  for(int i=2;i<n;i++){	  
		  arr[i]=arr[i-1]+arr[i-2];
	  }
	  return arr[n-1]+arr[n-2];
  }
  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
	System.out.println(calc_fib_fast(n));
	/*Random rand=new Random();
	while(true){
		int n=rand.nextInt(50);
		if(calc_fib_fast(n)==calc_fib(n))
			System.out.println(calc_fib_fast(n));
		else
		{
			System.out.println(calc_fib_fast(n)+" "+calc_fib(n));
			break;
		}
	}*/
  }
  
}

