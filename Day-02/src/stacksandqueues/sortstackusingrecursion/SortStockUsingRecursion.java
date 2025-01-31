package stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

public class SortStockUsingRecursion {
    public static void sort(int element, Stack<Integer> stack) {
        if (stack.isEmpty() || element <= stack.peek()) {
            stack.push(element);
            return;
        }
        int x = stack.pop();
        sort(element, stack);
        stack.push(x);
    }

    public static   void solve(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int element = stack.pop();
        solve(stack);
        sort(element, stack);
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(6);
        st.push(1);
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(4);
        st.push(3);
        System.out.println(st);

        solve(st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");

        }


    }
}
