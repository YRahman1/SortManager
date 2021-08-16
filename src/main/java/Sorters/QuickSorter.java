package Sorters;

public class QuickSorter implements Sortable
{
    private int[] array;

    public int[] sortArray(int[] arrayToSort)
    {
        this.array = arrayToSort;
        quickSort(0,array.length-1);
        return array;
    }

    private void quickSort(int left, int right)
    {
        int indexLeft = left;
        int indexRight = right;
        int pivot = array[(left+right)/2]; //Finding the middle pivot point
        int temp;
        while(indexLeft <= indexRight)
        {
            while(array[indexLeft] < pivot)
            {
                indexLeft++;
            }
            while(array[indexRight] > pivot)
            {
                indexRight--;
            }
            if(indexLeft <= indexRight)
            {
                swap(indexLeft,indexRight);
                indexLeft++;
                indexRight--;
            }
        }
        if(left < indexRight)
        {
            quickSort(left,indexRight);
        }
        if(indexLeft < right)
        {
            quickSort(indexLeft,right);
        }
    }

    private void swap(int left, int right)
    {
        int temp = array[left];
        array[left]= array[right];
        array[right] = temp;
    }
}
