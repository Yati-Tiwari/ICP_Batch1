public class Stack_implementation {

    // Stack class using array
    static class Stack {
        private int[] arr;   // array to store stack elements
        private int top;     // index of top element
        private int n;       // capacity of stack

        // Constructor - initializes stack
        public Stack(int size) {
            arr=new int[size];  // create array of given size
            n = size;             // store capacity
            top = -1;             // initially stack is empty
        }

        // Push operation: insert element at top
        public void push(int x) {
            // check overflow condition
            if (isFull()) {
                System.out.println("Stack Overflow: Cannot push " + x);
                return;
            }
            arr[++top] = x;  // increment top then insert value
            System.out.println("Pushed: " + x);
        }

        // Pop operation: remove and return top element
        public int pop() {
            // check underflow condition
            if (isEmpty()) {
                System.out.println("Stack Underflow: Cannot pop");
                return -1;
            }
            return arr[top--];   // return and decrement top
        }

        // Peek operation: return top element without removing
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        public boolean isFull() {
            return top == n - 1;
        }
    }

    // Main method for testing stack operations
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);  // overflow occurs here

        // pop all elements
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        // popping again gives underflow
        System.out.println("Pop again: " + stack.pop());
    }
}
