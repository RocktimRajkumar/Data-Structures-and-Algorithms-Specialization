import java.util.*;

public class LCM {
  private static long lcm_naive(long a, long b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }

  private static long gcd_fast(long a,long b){
    if(b==0)
      return a;
    long temp=a%b;
    return gcd_fast(b,temp);

  }

  private static long lcm_fast(long a,long b){
    return (a*b)/gcd_fast(a,b);

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();

    // System.out.println(lcm_naive(a, b));
    System.out.println(lcm_fast(a,b));

    //Stress Test
   /* Random rand=new Random();
    while(true){
      int a=rand.nextInt(20)+1;
      int b=rand.nextInt(20);
      long lcm_naive=lcm_naive(a, b);
      long lcm_fast= lcm_fast(a, b);
      if(lcm_naive==lcm_fast)
        System.out.println("good");
      else{
        System.out.println(lcm_naive+" not equal "+lcm_fast);
        break;
      }
    }*/

  }
}
