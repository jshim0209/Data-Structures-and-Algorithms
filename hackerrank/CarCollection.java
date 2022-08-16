import java.util.*;

import java.io.*;

import java.lang.Math;



public class Main{

    public static int carCollection(int N,int[] X,int K,int[] M){

        

        int count = 0;



        for (int i = 0; i < K; i++) {

            for (int j = 0; j < N; j++) {

                if (M[i] >= X[j]) {

                    count++;

                }

            }   

        }

        return count;

    }



    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);



        // INPUT [uncomment & modify if required]

        int N = sc.nextInt();

        int[] X = new int[N];

        for (int i = 0; i < N; i++){

        X[i] = sc.nextInt();

        }

        int K = sc.nextInt();

        int[] M = new int[K];

        for (int i = 0; i < K; i++){

        M[i] = sc.nextInt();

        }

        



        sc.close();



        System.out.print(carCollection(N,X,K,M));

    }

}