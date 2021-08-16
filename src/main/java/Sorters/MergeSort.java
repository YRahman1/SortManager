package Sorters;

public class MergeSort implements Sortable
{
    public int[] sortArray(int[] arrayToSort)
    {
        sort(arrayToSort,0,arrayToSort.length - 1);
        return arrayToSort;
    }

    private void sort(int arrayToSort[], int left, int right)
    {
        if (left < right)
        {
            int middle =left+ (right-left)/2;

            sort(arrayToSort, left, middle);
            sort(arrayToSort, middle + 1, right);
            merge(arrayToSort, left, middle, right);
        }
    }

    private int[] merge(int arrayToSort[], int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];


        for (int i = 0; i < n1; ++i)
        {
            leftArray[i] = arrayToSort[left + i];
        }
        for (int j = 0; j < n2; ++j)
        {
            rightArray[j] = arrayToSort[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arrayToSort[k] = leftArray[i];
                i++;
            }
            else {
                arrayToSort[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arrayToSort[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arrayToSort[k] = rightArray[j];
            j++;
            k++;
        }
        return arrayToSort;
    }
}
