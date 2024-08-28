package org.example.sandbox.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    public static void main(String[] args) {
        FibonacciNumbers fn = new FibonacciNumbers();

        for (int n =0; n <= 92; n++){
            System.out.println("fib(" + n + ") - " + (fn.fib(n)));
        }
    }
    public long fib(int x) {
        //f0 = 0
        if(x == 0) {
            return 0L;
        }
        //f1 = 1
        if (x == 1) {
            return 1L;
        }

        return fib(x-1) + fib(x - 2);
    }
public long memo (int m) {
        Long value = dictionary.get(m);
}


}