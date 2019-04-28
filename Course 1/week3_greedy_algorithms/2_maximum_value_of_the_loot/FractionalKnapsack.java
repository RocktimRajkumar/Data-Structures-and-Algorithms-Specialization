import java.util.Scanner;
import java.text.*;

public class FractionalKnapsack {
    private static String getOptimalValue(int capacity,int[] weights,double[] valuePerUnit) {
        double value = 0;
        DecimalFormat df = new DecimalFormat("#.0000"); 
        //write your code here
        for(int i=0; i<weights.length;i++){
            if(capacity==0)
                return df.format(value);
            int a=Math.min(weights[i],capacity);
            value+=valuePerUnit[i]*a;
            capacity-=a;
        }
        return df.format(value);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        double[] valuePerUnit = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
            valuePerUnit[i] = (double)values[i]/weights[i];
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(valuePerUnit[j]<valuePerUnit[j+1])
                {
                    double temp=valuePerUnit[j+1];
                    valuePerUnit[j+1]=valuePerUnit[j];
                    valuePerUnit[j]=temp;
                    int temp1=weights[j+1];
                    weights[j+1]=weights[j];
                    weights[j]=temp1;
                }
            }
        }

        System.out.println(getOptimalValue(capacity, weights,valuePerUnit));
    }
} 
