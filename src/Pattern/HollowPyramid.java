package Pattern;

import java.util.Scanner;

public class HollowPyramid {


    static void hollowPyraid(int n){
        for(int i=0; i<4; i++){
            for(int j=0; j<7; j++){
                if(i==1&&j==4||(i==2||i==3&&j+j==8)||i==4){
                    System.out.println("*");
                }
                else {
                    System.out.println(" ");
                }
                System.out.println();
            }

        }
    }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         //int n=sc.nextInt();


    }
}
