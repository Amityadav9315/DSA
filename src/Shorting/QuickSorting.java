package Shorting;
import java.util.Scanner;
public class QuickSorting {
       static  int    partition(int[] arr,int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //Swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    static  void quicksort(int[] arr,int low ,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
