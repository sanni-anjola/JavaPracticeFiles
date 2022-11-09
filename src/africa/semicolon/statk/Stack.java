package africa.semicolon.statk;

import java.util.Arrays;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    private int maxValue = Integer.MIN_VALUE;

    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
//O(n)
    public void push(int x)
    {
        if (isFull())
        {
//            System.out.println("Overflow\nProgram Terminated\n");
//            System.exit(-1);
            capacity = capacity * 2;

            var new_arr = Arrays.copyOf(arr, capacity);
//            for(int i = 0; i < arr.length; i++){
//                new_arr[i] = arr[i];
//            }
//            arr = new_arr;
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
    public int getMax(){
        int max = arr[0];

        for(int i: arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;               // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}
