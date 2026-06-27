package ds;

public class Ordenacao {

    public static void ordena(int v[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (v[j] < v[min])
                    min = j;

            int x = v[min];
            v[min] = v[i];
            v[i] = x;
        }
    }
    
    // New method
    public static boolean isSorted(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            if (v[i - 1] > v[i]) {
                return false;
            }
        }
        return true;
    }
}
