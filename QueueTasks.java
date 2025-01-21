/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayein;

/**
 *
 * @author danis
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTasks {

    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0 || k > queue.size()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int remainingSize = queue.size();
        for (int i = 0; i < remainingSize; i++) {
            queue.add(queue.poll());
        }
    }

    public static int getMinimum(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }

        int min = Integer.MAX_VALUE;
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int current = queue.poll();
            min = Math.min(min, current);
            queue.add(current);
        }

        return min;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;
        reverseFirstKElements(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);

        int min = getMinimum(queue);
        System.out.println("Minimum value in the queue: " + min);
    }
}
