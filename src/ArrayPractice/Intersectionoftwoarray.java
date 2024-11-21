package ArrayPractice;

import java.util.Scanner;

public class Intersectionoftwoarray {
    static  void intersectionOfArray(int n,int m,int array1[],int array2[] ){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            if(array1[i]==array2[j]){
                System.out.println(array1[i]);
                break;
            }
        }

    }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[m];
        for(int i=0; i<n; i++){
            array1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            array2[i]=sc.nextInt();
        }
        intersectionOfArray(n,m, array1,array2);


    }
}
