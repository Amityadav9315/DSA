package Shorting;

import java.util.Scanner;
import java.util.*;

public class MergeSorting {


     static void Conquer(int[] arr,int st,int mid,int ed){
       //  int n= arr.length;
         int[] merged=new int[ed-st+1];
         int idx1=st;
         int idx2=mid+1;int x=0;
         while(idx1<=mid&&idx2<=ed){
             if(arr[idx1]<=arr[idx2]){
                 merged[x++]=arr[idx1++];}
             else {
                 merged[x++]=arr[idx2++];
             }}
         while (idx1<=mid){
                 merged[x++]=arr[idx1++];}
         while(idx2<=ed){
                 merged[x++]=arr[idx2++];
             }
         for(int i=0,j=st; i<merged.length; i++,j++){
             arr[j]=merged[i];
         }}
    static void Divide(int[] arr,int st,int ed){
        if(st>=ed){
            return;
        }
        int mid=st+(ed-st)/2;
        Divide(arr,st,mid);
        Divide(arr,mid+1,ed);
        Conquer(arr,st,mid,ed);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Divide(arr,0,n-1);
        for(int i=0; i< n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();



    }
}
