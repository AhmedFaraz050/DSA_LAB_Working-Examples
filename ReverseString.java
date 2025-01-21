/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayein;

/**
 *
 * @author danis
 */
public class ReverseString {

    static class CharStack {
        private char[] stack;
        private int top;
        private int capacity;

        public CharStack(int size) {
            stack = new char[size];
            top = -1;
            capacity = size;
        }

        public void push(char element) {
            if (isFull()) return;
            stack[++top] = element;
        }

        public char pop() {
            if (isEmpty()) return '\0';
            return stack[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static String reverse(String input) {
        CharStack stack = new CharStack(input.length());
        for (char c : input.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}

