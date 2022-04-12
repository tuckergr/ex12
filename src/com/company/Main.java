package com.company;

import java.util.*;

class Main {
    static class Queue {
        static Stack<String> s1 = new Stack<String>();
        static Stack<String> s2 = new Stack<String>();

        static void enQueue(String x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static String deQueue() {
            if (s1.isEmpty()) {
                System.out.println("Q is Empty");
                System.exit(0);
            }

            String x = s1.peek();
            s1.pop();
            return x;
        }
    };

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue("Hello");
        q.enQueue("World");

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}