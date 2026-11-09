import java.io.*;
import java.util.*;

public class task2 {
    public static long count=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] temp = new int[n];
        mergeSort(arr, temp, 0, n-1);
        pw.println(count);
        pw.flush();
    }
    public static void mergeSort(int[] arr, int[] temp ,int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        countPairs(arr, left, mid, right);
        merge(arr,temp, left, mid, right);
    }

    public static void countPairs(int[] arr, int left, int mid, int right) {
        int rightLen = right - mid;
        long[] rightSquared = new long[rightLen];

        for (int j = 0; j < rightLen; j++) {
            long val = arr[mid + 1 + j];
            rightSquared[j] = val * val;
        }

        Arrays.sort(rightSquared);

        int idx = 0;
        for (int i = left; i <= mid; i++) {
            while (idx < rightLen && (long) arr[i] > rightSquared[idx]) {
                idx++;
            }
            count += idx;
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= right){
            temp[k++] = arr[j++];
        }

        for (int p = left; p <= right ; p++) {
            arr[p] = temp[p];
        }
    }
}