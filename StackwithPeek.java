/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayein;

/**
 *
 * @author danis
 */
public class StackwithPeek {

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
            if (isFull()) {
                System.out.println("Stack is full.");
                return;
            }
            stack[++top] = element;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); 
        System.out.println("Popped element: " + stack.pop());     
        System.out.println("Top element (peek): " + stack.peek()); 
    }
}
