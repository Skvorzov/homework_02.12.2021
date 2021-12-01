package com.skvortsov;

public class MyStack implements Stackable {
    private int size;
    private int[] arr = new int[size];
    private int top;

    public MyStack(int n) {
        this.size = n;
        arr = new int[size];
        this.top = -1;
    }

    public void addElement(int element) {
        if (top == size - 1) {
            System.out.println("You cant add element. Stack is full");
        } else {
            arr[++top] = element;
        }
    }

    public int deleteElement() {
        if (top == -1) {
            System.out.println("You cant delete element. Stack is empty");
        }
        return arr[top--];
    }

    public int showTopElement() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}