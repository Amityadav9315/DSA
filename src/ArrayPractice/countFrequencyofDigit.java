package ArrayPractice;

import java.util.Scanner;

public class countFrequencyofDigit {

    static void countFrequency(int n,int array[]){
        int[] array2=new int[n];
        int visited=-1;
        for(int i=0; i<n; i++ ) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array2[j] = visited;
                }



            }
            if (array2[i] != visited) {
                array2[i] = count;

            }
        }
            for(int i=0; i<n; i++){
                if(array2[i]!=visited){
                    System.out.println(array[i] +" "+array2[i]);
                }
                System.out.println();

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
