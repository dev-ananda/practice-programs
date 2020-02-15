package dev.ananda.efficient;

public class FibonacciMultipleOfN {

//    An efficient way to check whether n-th Fibonacci number is multiple of 10
//    https://www.geeksforgeeks.org/efficient-way-check-whether-n-th-fibonacci-number-multiple-10/

    /*
    Examples:

    Input : 15
    Output : Yes

    Input : 17
    Output : No
    */

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonacci("+n+") : "+c);
        return c;
    }

    public static boolean isMultipleOf10(int n) {
        return fibonacci(n) % 10 == 0;
    }

    public static void main(String[] args) {
        int n = 36;
        if(isMultipleOf10(n)){
            System.out.println("Multiple of 10!!");
        } else {
            System.out.println("Not multiple of 10!!");
        }
    }

}