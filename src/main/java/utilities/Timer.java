package utilities;

import Sorters.Sortable;

public class Timer
{
    public int[] getTimeNano(Sortable s , int[] arrayToSort)
    {
        long currentTime;
        long elapsedTime;
        int[] sortedArray;
        currentTime = System.nanoTime();
        sortedArray = s.sortArray(arrayToSort);
        elapsedTime = System.nanoTime() - currentTime;
        System.out.println("Time take to sort: " + elapsedTime + " nanoseconds.");
        return sortedArray;

    }
}
