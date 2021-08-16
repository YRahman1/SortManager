package utilities;

import Binary.BinaryTree;
import Sorters.*;

//The factory pattern is used here to not need to create an instance of every sorter,saving on memory assigning sorters
public class SortableFactory
{
    public static Sortable getSorter(int option)
    {
        switch(option)
        {
            case(1):
                System.out.println("Sorted array using Bubble Sort:");
                return new BubbleSort();
            case(2):
                System.out.println("Sorted array using Insertion Sort:");
                return new InsertionSort();
            case(3):
                System.out.println("Sorted array using Binary Sort:");
                return new BinaryTree();
            case(4):
                System.out.println("Sorted array using Quick Sort:");
                return new QuickSorter();
            case(5):
                System.out.println("Sorted array using Selection Sort:");
                return new SelectionSort();
            case(6):
                System.out.println("Sorted array using Selection Sort:");
                return new MergeSort();
            default:
                break;
        }
        return null;
    }

}
