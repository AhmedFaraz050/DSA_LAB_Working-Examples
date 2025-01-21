/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayein;

/**
 *
 * @author danis
 */
public class SearchInStack {

    static class Stack {
        private int[] stack;
        private int top;
        private int capacity;

        public Stack(int size) {
            stack = new int[size];
            top = -1;
            capacity = size;
        }

        public void push(int element) {
            if (isFull()) return;
            stack[++top] = element;
        }

        public int pop() {
            if (isEmpty()) return -1;
            return stack[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public int size() {
            return top + 1;
        }
    }

    public static int search(Stack stack, int element) {
        Stack temp = new Stack(stack.size());
        int position = -1;
        int index = 0;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value == element) position = index;
            temp.push(value);
            index++;
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return position;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        int element = 15;
        int position = search(stack, element);

        if (position != -1) {
            System.out.println("Element " + element + " found at position (from top): " + position);
        } else {
            System.out.println("Element " + element + " not found in the stack.");
        }
    }
}

