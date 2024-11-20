/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lb07_dsa;

/**
 *
 * @author 123
 */
class Stack {

    private int arr[];
    private int size;
    private int index;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        index = 0;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }

    public int size() {
        return index;
    }
}

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);
        
        System.out.println("1. Size of stack after push operations: " + stack.size());
        
        System.out.print("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
        
        System.out.println();
        
        System.out.println("3. Size of stack after pop operations: " + stack.size());
    }
}

