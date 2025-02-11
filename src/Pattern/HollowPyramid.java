package Pattern;

import java.util.Scanner;

public class HollowPyramid {


    static void hollowPyraid(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=7; j++){
                if((i==1&&j==4)||(i==2&&(i+j==5||i+j==7))||(i==3&&(i+j==5||i+j==9))||(i==4&&j%2!=0)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       //  int n=sc.nextInt();
        hollowPyraid();
        
        


    }
}
