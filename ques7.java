import java.math.BigDecimal;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        // Store original strings
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort using a custom comparator and stable sort
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);
                return b2.compareTo(b1); // descending
            }
        });

        // Print output preserving original format
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
