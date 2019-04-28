import java.util.*;
import java.io.*;
class MaxPairwiseProduct{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []v=new int[n];
		for(int i=0;i<n;i++){
			v[i]=sc.nextInt();
		}
		System.out.println(MaxPairwiseProduct(v));
		//System.out.println(MaxPairwiseProductNaive(v));*/
		// while(true){
		// 	Random rand=new Random();
		// 	int len=rand.nextInt(15050)+2;
		// 	int []v=new int[len];
		// 	for(int i=0;i<len;i++){
		// 		v[i]=rand.nextInt(9000);
		// 	}
		
		// 	for(int i=0;i<len;i++){
		// 		System.out.print(v[i]+" ");
		// 	}
		// 	System.out.println();
		// 	Long f=MaxPairwiseProduct(v);
		// 	Long b=MaxPairwiseProductNaive(v);
		// 	if(f.compareTo(b)!=0){
		// 		System.out.println("wrong answer "+f+" "+b);
		// 		break;
		// 	}
		// 	else{
		// 		System.out.println("OK");
		// 	}
		// }
	}
	
	
	public static Long MaxPairwiseProductNaive(int[] v){
		int len=v.length;
		Long product=0L;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(i!=j && (v[i]*v[j])>product){
					product=(long)v[i]*(long)v[j];
				}
			}
		}
		return product;
	}
	
	public static Long MaxPairwiseProduct(int[] v){
		
		int len=v.length;
		int first_max=0;
		int second_max=0;
		for(int i=1;i<len;i++){
			if(v[i]>v[first_max]){
				first_max=i;
			}
		}
		int temp=v[first_max];
		v[first_max]=v[len-1];
		v[len-1]=temp;
		for(int i=1;i<len-1;i++){
			if(v[i]>v[second_max]){
				second_max=i;
			}
		}
		return (long)v[len-1]*(long)v[second_max];
	}
	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
