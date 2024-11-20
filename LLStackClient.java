/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lb07_dsa;

/**
 *
 * @author 123
 */
class Linkedlist {
    private Node top;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    public Node deleteFirst() {
        if (top == null) {
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    public void DisplayList() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class LinkedlistStack {
    Linkedlist li = new Linkedlist();

    public void push(int element) {
        li.insertFirst(element);
    }

    public void pop() {
        li.deleteFirst();
    }

    public void displayStack() {
        System.out.println(" ");
        li.DisplayList();
    }
}

class LLStackClient {
    public static void main(String[] args) {
        LinkedlistStack st = new LinkedlistStack();

        st.push(50);
        st.push(70);
        st.push(190);

        System.out.println("1. Stack after push operation:");
        st.displayStack();

        System.out.println("2. Stack after pop operation:");
        st.pop();
        st.displayStack();
    }
}
