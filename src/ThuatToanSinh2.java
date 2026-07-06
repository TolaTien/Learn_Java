public class ThuatToanSinh2 {

    static boolean next_permutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if(i < 0) return  false;
        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        swap(a, i, j);
        int l = i + 1;
        int r = a.length - 1;
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
        return true;
    }

    static  void  swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 4, 2};
        printArray(a);
        while (next_permutation(a)) {
            printArray(a);
        }

    }
}
