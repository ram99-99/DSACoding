package org.example.SlidingWindow;

import java.util.List;
import java.util.Stack;

public class QueueUsingTwoStacks {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        System.out.println("stack1 : "+stack1);

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("stack2 : "+stack2);

        return stack2.pop();
    }

    // Peek
    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.peek());// 30
        System.out.println(queue);
    }
}