package dev.ananda.dsa.dp.fibonacci;

public class Fibonacci {

    //Backtracking solution
    public static int fibonacci(int n){
        if (0 == n){
            return 0;
        }
        if( 1==n ){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
