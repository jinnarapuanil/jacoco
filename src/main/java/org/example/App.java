package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{


    public int add(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public int add(Integer... args) {
        return Arrays.stream(args).mapToInt(i -> i).sum();
    }
}
