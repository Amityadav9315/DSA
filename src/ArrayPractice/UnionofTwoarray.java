package ArrayPractice;

import java.util.Scanner;

public class UnionofTwoarray {
    static  void unoinofArray(int n,int m,int array1[],int array2[]){
        int[] array3=new int[n+m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                while(j>=i) {
                    if (array3[i] != array1[j] && array3[i] != 0) {
                        i++;
                    }
                }

                        array3[i] = array1[j];
                         i=0;



            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                while(j>=i) {
                    if (array3[i] != array2[j]) {
                        i++;
                    }
                }

                array3[i] = array2[j];
                i=0;



            }
        }
        for (int x: array3){
            System.out.println(x);

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
        unoinofArray(n,m,array1,array2);

    }
}
