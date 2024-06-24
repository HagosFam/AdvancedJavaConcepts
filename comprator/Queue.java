package comprator;
import java.util.Stack;

public class Queue {
    private Stack<Integer> stack1;
    public Queue() {
        stack1 = new Stack<>(); // creating empty stack
    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if(stack1.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
       return stack1.pop();
    }


    public static void main(String[] args) {
        Queue queues = new Queue();
        queues.enqueue(3);
        System.out.println(queues.dequeue());


    }
}
