/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayein;

/**
 *
 * @author danis
 */
public class ReverseNumber {

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
    }

    public static int reverse(int number) {
        Stack stack = new Stack(String.valueOf(number).length());
        while (number != 0) {
            stack.push(number % 10);
            number /= 10;
        }

        int reversed = 0;
        int place = 1;
        while (!stack.isEmpty()) {
            reversed += stack.pop() * place;
            place *= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverse(number);
        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reversed);
    }
}
