import java.util.Stack;

public class StackOperationsDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements: " + stack);

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping element: " + stack);

        // Peeking (viewing) the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peeking: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Finding the size of the stack
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);
    }
}
