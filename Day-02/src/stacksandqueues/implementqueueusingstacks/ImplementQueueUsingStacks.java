package stacksandqueues.implementqueueusingstacks;

import  java.util.Stack;
class MyQueue {
    Stack<Integer>input=new Stack<>();
    Stack<Integer>output=new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(!output.isEmpty()){
            int x=output.pop();
            return x;
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());

            }
        }
        int x=output.pop();
        return x;


    }

    public int peek() {
        if(!output.isEmpty()){
            int x=output.peek();
            return x;
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());

            }
        }
        int x=output.peek();

        return x;



    }
    public boolean isEmpty() {
        if(input.isEmpty() && output.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push(10);
        queue.push(11);
        queue.push(12);
        //System.out.println(queue.peek());
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.pop();
        }
    }
}
