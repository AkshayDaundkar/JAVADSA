package Leetcode.Easy;

import java.util.Stack;

public class Baseball_Stack {

    public static int calPoints(Stack<String> operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i) == "C") {
                stack.pop();
            } else if (operations.get(i) == "D") {
                int doubleelement = stack.peek();
                stack.push(doubleelement * 2);
            } else if (operations.get(i) == "+") {
                int x = stack.pop();//10
                int y = stack.pop();//5
                int z = x + y;
                stack.push(y);
                stack.push(x);
                stack.push(z);
            } else {
                stack.push(Integer.parseInt(operations.get(i)));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
        return sum;

    }


    public static void main(String[] args) {
        Stack<String> operations = new Stack<>();
//        /["5","2","C","D","+"]
        //["5","-2","4","C","D","9","+","+"]
        operations.push("5");
        operations.push("-2");
        operations.push("4");
        operations.push("C");
        operations.push("D");
        operations.push("9");
        operations.push("+");
        operations.push("+");

        System.out.println("Stack: " + operations);
        calPoints(operations);


    }
}
