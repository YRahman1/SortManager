package Sorters;

public class InsertionSort implements Sortable
{
    public int[] sortArray(int[] arrayToSort)
    {
       return insertionSort(arrayToSort);
    }

    private int[] insertionSort(int[] arrayToSort)
    {
        for (int i = 1; i < arrayToSort.length; ++i)
        {
            int current = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > current)
            {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = current;
        }
        return arrayToSort;
    }
}
