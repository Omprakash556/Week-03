package stacksandqueues.stockspanproblem;

import java.util.Stack;

public class StockSpan {
    public static void calculateSpan(int stock[], int span[]){
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for (int i=1; i< stock.length; i++){
            int currPrice = stock[i];
            while (!stack.isEmpty() && stock[stack.peek()] <= currPrice){
                stack.pop();
            }if(stack.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = stack.peek();
                span[i] = i-prevHigh;
            }
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        calculateSpan(stock, span);

        for (int i = 0; i<span.length; i++) {
            System.out.println(span[i]+" ");
        }
    }
}
