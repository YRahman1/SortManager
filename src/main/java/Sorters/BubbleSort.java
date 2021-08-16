package Sorters;

public class BubbleSort implements Sortable
{

    public int[] sortArray(int[] arrayToSort)
    {
        return bubbleSort(arrayToSort);
    }

    private int[] bubbleSort(int[] arrayToSort)
    {
        int temp;
        for(int j = 0;j < arrayToSort.length - 1; j++ )
        {
            for (int i = 0; i < arrayToSort.length - j - 1; i++)
            {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    // if n is bigger than n+1 in the array then we must swap
                    //We do this by using a temporary int to store one of swap elements.
                    temp = arrayToSort[i + 1];
                    arrayToSort[i + 1] = arrayToSort[i];
                    arrayToSort[i] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
