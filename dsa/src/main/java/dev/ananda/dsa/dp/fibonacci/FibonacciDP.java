package dev.ananda.dsa.dp.fibonacci;

public class FibonacciDP {

    private static int [] fib;
    static {
        fib = new int[101];
        fib[0] = 0;
        fib[1] = 1;
        for (int i=2; i<101; i++){
            fib[i] = -1;
        }
    }

    public static int fibonacci(int n){
        if(0 == n){
            return 0;
        }
        if(1 == n){
            return 1;
        }
        if(-1 != fib[n]){
            return fib[n];
        }
        fib[n] = fibonacci(n-1)+fibonacci(n-2);
        return fib[n];
    }
}
