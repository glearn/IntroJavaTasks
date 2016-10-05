package com.introjava.Chapter7.sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 1, 4, 3, 2, 7, 6, 10};

//        Arrays.sort(numbers);

//        int index = Arrays.binarySearch(numbers, 9);

//        Sort.quicksort(numbers, ?);

//         java.util.DualPivotQuicksort

//        --------------------------------------------------------------------------------------------------------------


//        selectionSort(numbers);

//        bubbleSort(numbers);

//        insertionSort(numbers);

//        System.out.println("QUICK SORT");
//        System.out.println("before: " + Arrays.toString(numbers));
//        quicksort(numbers, 0, numbers.length - 1);
//        System.out.println("after:  " + Arrays.toString(numbers));

//        System.out.println("MERGE SORT");
//        System.out.println("before: " + Arrays.toString(numbers));
//        mergesort1(numbers, 0, numbers.length - 1);
//        System.out.println("after:  " + Arrays.toString(numbers));

//        System.out.println("MERGE SORT");
//        System.out.println("before: " + Arrays.toString(numbers));
//        mergesort2(numbers, 0, numbers.length - 1);
//        System.out.println("after:  " + Arrays.toString(numbers));

        heapsort(numbers);

//        shuffle(numbers);
//        System.out.println("shuffled:  " + Arrays.toString(numbers));


//        System.out.println(linearSearch(numbers,10));

        System.out.println(binSearch(numbers, 5));

    }

    private static void selectionSort(int[] array) {
        // swaps the first element with element on the right, then second, etc.

        // best, worse, average case: O(n^2)

        // memory: O(1)  - не зависи от обема входни данни

        // stable: no

        // method: selection

        System.out.println("SELECTION SORT");
        System.out.println("before: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        System.out.println("after:  " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        // swaps to neighbor elements when not in order until sorted

        // this is for implementation from the screencast
        // best case: O(n)
        // worst and average cases: O(n^2)

        /*
            do
                swapped = false
                for i = 1 to indexOfLastUnsortedElement
                    if leftElement > rightElement
                        swap(leftElement, rightElement)
                        swapped = true
            while swapped
         */

        // for this implementation all should be O(n^2)

        // memory: O(1)

        // stable: yes

        // method: exchanging

        System.out.println("BUBBLE SORT");
        System.out.println("before: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        System.out.println("after:  " + Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        // доказано най-ефективен при малко на брой елементи (например 0 до 20)

        // move the first unsorted element left to its place

        // best case: O(n)
        // worst and average: O(n^2)

        // memory: O(1)

        // stable: yes

        // method: insertion

        System.out.println("INSERTION SORT");
        System.out.println("before: " + Arrays.toString(array));

        for (int firstUnsorted = 1; firstUnsorted < array.length - 1; firstUnsorted++) {
            int i = firstUnsorted;
            while (i > 0 && array[i - 1] > array[i]) {
                int tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                i--;
            }
        }

        System.out.println("after:  " + Arrays.toString(array));

//        3,44,| [38],5,47,15,36,26,27,2,46,4,19,50,48
//
//        3,38,44,| [5],47,15,36,26,27,2,46,4,19,50,48
//
//        3,5,38,44,| [47],15,36,26,27,2,46,4,19,50,48
//
//        3,5,38,44,47| [15],36,26,27,2,46,4,19,50,48
//
//        3,5,15,38,44,47| [36],26,27,2,46,4,19,50,48
//
//        3,5,15,36,38,44,47|26,27,2,46,4,19,50,48
//        ...
    }

    private static void quicksort(int[] array, int l, int r) {
        // choose a pivot (отправна точка); move smaller elements to left and larger to right; sort left and right subarrays

        // best and average case: O(n*log n)
        // worst case (very rear): O(n^2)

        // memory: O(n*log n) stack space (for recursion)

        // stable: depends (в общият случай не е стабилен)

        // method: partitioning

        int i = l; // i присвоява левия край
        int j = r; // j присовява десния край

        System.out.printf("\nwill sort subarray [%d to %d]\n", array[i], array[j]);
        int x = array[(l + r) / 2]; // x присовява средния елемент
        System.out.printf("x= %d\n", x);
        do {
            while (array[i] < x) { // търси докато намери елемент >= на средния елемент
                i++;
            }
            System.out.printf("i el= %d\n", array[i]);


            while (array[j] > x) { // търси докато не намери елемент <= на средния елемент
                j--;
            }
            System.out.printf("j el= %d\n", array[j]);

            if (i <= j) {
                // размени двата елемента
                System.out.printf("swap %d <-> %d\n", array[i], array[j]);

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                System.out.printf("%s\n", Arrays.toString(array));

                i++;
                j--;
            }
        } while (i <= j);

        if (l < j) {
            System.out.println("\nleft");

            quicksort(array, l, j);
        }

        if (i < r) {
            System.out.println("\nright");

            quicksort(array, i, r);
        }

        /*
            quicksort(arr, lo, hi)
                if lo < hi
                    p = partition(arr,lo,hi)
                    quicksort(arr, lo, p)
                    quicksort(arr, p+1, hi)


            In this implementation is used "Hoare partitioning". (справя се с worst case, по-оптимален : избира средния елемент за pivot, става O(n * log n))
            There are other method called "Lomuto partitioning"
        */
    }

    private static void mergesort1(int[] array, int l, int r) {
        // 1. divide the array into 2 sub-arrays
        // 2. sort each sub-array (recursively)
        // 3. merge sorted sub-arrays into single array

        // best, average and worse: O(n*log n)

        // memory:
        //  typically O(n)
        //  with in-place merge can be O(1)

        // stable: yes
        // method: merging

        // highly parallelizable on multiple cores / machines : up to O(log n )

        if (l < r) {
            int m = (l + r) / 2;
            mergesort1(array, l, m);     // соритра единия подмасив
            mergesort1(array, m + 1, r); // сортира втория подмасив
            merge1(array, l, m, r);      // обединява сортираните подмасиви
        }
    }

    private static void merge1(int[] array, int l, int m, int r) {// обединява сорт. подмасиви
        final int maxEl = array.length;

        int i = l;
        int j = m + 1;
        int k = 0;

        int[] c = new int[maxEl];

        while (i <= m && j <= r) {
            if (array[i] <= array[j]) {
                c[k++] = array[i++]; /* c[k]=A[i];k++;i++;*/
            } else {
                c[k++] = array[j++];
            }
        }

        if (i > m) {
            while (j <= r) {
                c[k++] = array[j++];
            }
        } else {
            while (i <= m) {
                c[k++] = array[i++];
            }
        }

        for (i = 0; i < k; i++) {
            array[l + i] = c[i];
        }
    }

    private static void mergesort2(int[] array, int start, int end) {
        if (start == end) {
            return;
        }

        int mid = (start + end) / 2;

        mergesort2(array, start, mid);
        mergesort2(array, mid + 1, end);

        int left = start;
        int right = mid + 1;
        int result = 0;

        int[] tmp = new int[end - start + 1];

        while (left <= mid && right <= end) {
            if (array[left] <= array[right]) { // add = to be stable
                tmp[result] = array[left];
                left++;
            } else {
                tmp[result] = array[right];
                right++;
            }
            result++;
        }

        while (left <= mid) {
            tmp[result] = array[left];

            result++;
            left++;
        }

        while (right <= end) {
            tmp[result] = array[right];

            result++;
            right++;
        }

        System.arraycopy(tmp, 0, array, start, tmp.length);
    }

    private static void heapsort(int[] array) {
        // heapsort works in two phases:
        // 1. a heap is built out of the array elements: O(n)
        // 2. a sorted array is created by removing the largest element from the heap n times: n * log(n)

        // best, worst, average; O(n* log(n))

        // memory: O(1) if the array and heap share the same memory

        // stable: no

        // method: selection

        System.out.println("HEAP SORT");
        System.out.println("before: " + Arrays.toString(array));

        int n = array.length;

        for (int i = n / 2; i >= 0; i--)// построява пирамида и поставя най-големия ел във върха
            sift(array, i, n);

        int temp = array[0]; //разменя първия ел с последния така най-големия ел застава на последно място
        array[0] = array[n - 1];
        array[n - 1] = temp;

        int m = n - 1;
        while (m > 1) { // докато остане един елемент отсявай нулевия елемент при размерност m

            sift(array, 0, m);
            temp = array[0];
            array[0] = array[m - 1];
            array[m - 1] = temp;
            m--;
        }
        System.out.println("after:  " + Arrays.toString(array));
    }

    private static void sift(int[] array, int v, int n) { // построява пирамида и поставя най-големият ел на върха
        int i = v;//върхът, който ще се отсява

        int j = 2 * v + 1;// ляв наследник

        if (j < n - 1 && array[j] < array[j + 1]) {
            j++; // ако левият насл < десния, j++ т.е.j сочи десният насл
        }

        int x = array[i];

        while (j < n && array[j] > x) { // ако десния насл > текущия връх
            array[i] = array[j];
            i = j;
            j = 2 * i + 1;
            if (j < n - 1 && array[j] < array[j + 1]) {
                j++;
            }
        }

        array[i] = x;
    }

    private static void countingSort(int[] array) {
        // sorts small integers by counting their occurrences
        // not a comparison-based sort

        // best, worst, average: O(n + k)
        // k is the range of numbers to be stored

        // memory: O(n + k)

        // space: O(k)

        // stable: yes

        // method: counting
        //TODO implement
    }

    // linear search - O(n)
    private static int linearSearch(int[] array, int el) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                return i;
            }
        }
        return -1;
    }

    // bin search - average O(log n), need SORTED collection

    private static int binSearch(int[] array, int el) {
        int l = 0;
        int r = array.length - 1; // l - ляв край на масива, r - десен
        while (l < r) {// докато има ел в масива
            int m = (l + r) / 2; // индекс на средния елемент
            if (array[m] == el)// ако средният ел == на търсения
                return m;
            if (el < array[m])
                r = m - 1; //махни дясната част, вкл и самият среден елемент
            else
                l = m + 1; //махни лявата част, вкл и самият среден елемент
        }
        if (array[r] == el) {
            return r;
        }
        return -1;
    }

    // interpolation search ???

    private static void shuffle(int[] array) {
        // Fisher-Yates algorithm

        Random random = new Random();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            // exchange array[i] with random element in array[i..n-1]
            int r = i + random.nextInt(n - i);
            int tmp = array[i];
            array[i] = array[r];
            array[r] = tmp;
        }
    }
}
