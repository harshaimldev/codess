import java.util.*;

public class longpref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        longp(arr);
    }

    public static void longp(String[] strs) {

        int i = 0;
        int j = 0;

        if (strs.length == 1) {
            System.out.print(strs[0]);
            return;
        }

        while (j < strs.length - 1) {
            if (i >= strs[j].length() || i >= strs[j + 1].length()) {
                break;
            }
            if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                j++;

                if (j == strs.length - 1) {
                    j = 0;
                    i++;
                }
            }
            else {
                break;
            }
        }

        System.out.print(strs[0].substring(0, i));
    }
}