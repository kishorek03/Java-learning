public class CountSortArray {
    public void sort(int a[], int n) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                count++;
            else if (a[i] == 1)
                count1++;
            else
                count2++;
        }
        for (int j = 0; j < count; j++)
            a[j] = 0;
        for (int j = count; j < count + count1; j++)
            a[j] = 1;
        for (int j = count + count1; j < n; j++)
            a[j] = 2;
    }

    public static void main(String[] args) {
        CountSortArray C = new CountSortArray();
        int[] array = {2, 1, 0, 1, 2, 0, 1};
        int n = array.length;
        C.sort(array, n);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
