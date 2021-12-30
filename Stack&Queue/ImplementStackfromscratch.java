package Stack&Queue;

public class MyStack {
    static int maxSize;
    static long[] stackArray;
    static int top;

    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public void pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        MySyack st = new MyStack(10);
        st.push(10);
    }
}
