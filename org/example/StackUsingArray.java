package org.example;

public class StackUsingArray {

    private final int[] stack;
    private int top;
    private final int capacity;

    // Constructor
    public StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push Operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    // Pop Operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        top--;
    }

    // Peek Operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    // Check if Empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Print Stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();   // 1 2 3

        stack.pop();

        stack.printStack();   // 1 2

        System.out.println("Peek: " + stack.peek()); // 2
        stack.push(5);
        stack.printStack();
       // stack.pop();
        stack.printStack();
        stack.push(6);
        stack.push(7);
       // stack.push(8);
        stack.printStack();
    }
}