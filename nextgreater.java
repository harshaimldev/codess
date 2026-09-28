public class nextgreater {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] span = new int[arr.length];
        stackIMS stack = new stackIMS(arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = -1;
            }
            else {
                span[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}