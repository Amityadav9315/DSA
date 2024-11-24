package ArrayPractice;

import java.util.Scanner;

public class CountFrequencyofElement {
    static  void countFrequency(int n,int array[]){
        int vistited=-1;
        int[] freq=new int[array.length];
        for(int i=0; i< array.length; i++){
            int count=1;
            for(int j=i+1; j< array.length; j++){
                if(array[i]==array[j]){
                    count++;
                    freq[j]=vistited;
                }
                if(freq[i]!=vistited){
                    freq[i]=count;
                }
            }
        }
        for(int i=0; i< freq.length; i++){
            if(freq[i]!=vistited){
                System.out.println("Element || Frequency");
                System.out.println(array[i]+"||"+ freq[i]);
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        countFrequency(n,array);




    }
}
