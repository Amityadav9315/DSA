package Largest;

import java.util.Scanner;

public class ThrirdLargest {
    static void Secondlargest(int n,int[] arr){
        int max=0;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int max2=0;
        for(int i=0; i<n; i++){
            if(max2<arr[i]&&arr[i]!=max){
                max2=arr[i];
            }

        }
        int max3=0;

        for(int i=0; i<n; i++){
            if(max3<arr[i]&&arr[i]!=max2&&arr[i]!=max){
                max3=arr[i];
            }
        }
        System.out.println("Max3 is" + max3branch
        );







    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Secondlargest(n,arr);

    }

    }

