class stackIMS implements sMethods {
    int[] arr;
    int top;

    stackIMS(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    @Override
    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = x;
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;
        return value;
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}



