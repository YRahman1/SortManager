package Sorters;

public class SelectionSort implements Sortable
{
    public int[] sortArray(int[] arrayToSort)
    {
        return selectionSort(arrayToSort);
    }

    private int[] selectionSort(int[] array)
    {
        int minIndex;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length-1; i++)
        {
            // Find the minimum element in unsorted array
            minIndex = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
