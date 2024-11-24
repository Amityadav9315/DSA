package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class countfrequencysecond {
    static  void countfreq(int n,int array[]){
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0; i<n; i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    count++;
                    visited[j]=true;

                }
            }
            System.out.println(array[i]+" "+count);
        }




    }
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array=new int[n];
        for(int i=0; i<n; i++){
        array[i]=sc.nextInt();
    }
        countfreq(n,array);
}
}
