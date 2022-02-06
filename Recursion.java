package homework7;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an index: ");
        int index = sc.nextInt();
        System.out.println("The Fibonacci number is " + FibonacciSeries(index));
    }

    static int FibonacciRecursive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            // #1 the direct solution
            return (0);
        } else if (n == 2) {
            // #1 the direct solution
            return (1);
        } else { 
            return (FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2));
            // #2 is that we're trying to find smaller Fibonacci numbers first
            // #3 is the FibonacciRecursive part, #4 is the addition
        }
    }

    static int FibonacciSeries(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return (0);
        } else if (n == 2) {
            return (1);
        } else {
            int previous = 0;
            int current = 1;
            for (int i = 0;  i < n-2; i++) {
                int next = current + previous;
                previous = current;
                current = next;
            }
            return current;
        }
        }
    }
