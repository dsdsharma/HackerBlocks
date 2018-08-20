package com.dsdsharma;

public class Codes {
    public static void one(int n){
        /*Pattern with Zeros
        Prints ladder pattern with zeros inbetween
        * */
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1){
                    System.out.print(i+"\t");
                }else{
                    System.out.print("0"+"\t");

                }
            }
            System.out.println();
        }
    }

}
