import java.util.Arrays;

public class Assigncookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length;
        int n = s.length;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }

        return i;
    }
       public static void main(String[] args) {
        Assigncookies455 solution = new Assigncookies455();

        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int result = solution.findContentChildren(g, s);

        System.out.println("Output: " + result); // Output: 1
    }
}
