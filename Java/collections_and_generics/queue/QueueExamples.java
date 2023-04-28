package collections_and_generics.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {
//        ex1();
//        checkException();
//        ex2();
        ex3();
    }

    private static void ex1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }

    private static void checkException() {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.poll());
    }

    private static void ex2() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addLast(4);
        System.out.println(deque.getFirst()); //10
        System.out.println(deque.removeFirst()); //10
        System.out.println(deque.removeLast()); //4
        System.out.println(deque.peekFirst()); //null
        System.out.println(deque.peekLast()); //null
    }

    private static void ex3() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
    }
}
