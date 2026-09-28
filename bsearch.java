import java.util.*;
public class bsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        bsearch(arr1, target);
    }

    public static void bsearch(int[] arr1, int target) {

        int i = 0;
        int j = arr1.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr1[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            }
            else if (arr1[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}