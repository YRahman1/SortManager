


# SortManager
This is a program which presents the user with different types of sorts and allows them to choose the number of elements they wish to sort. They will receive the sorted array and also the execution time in the sort.

#Requirements :
-Client is presented with a number of sort algorithms to choose from
-Decision is given via the command line (Scanner)
-The program will then ask for the length of an array again via the command line (Scanner)

The program should then output:
-The unsorted randomly generated array
-The sort algorithm to be used
-The sorted array after the algorithm has been executed
-The time taken

What the program does and how it works:
The sorts that are currently included:
- BubbleSort
- InsertionSort
- MergeSort
- QuickSort
- SelectionSort
- BinaryTreeSort

I have used the factory design principle as well as OOP principles to split my code into sorter objects and utility packages.
I have used a class interface which is used to provide a template for each sorter. Each sorter will return a sorted array.
The utilities include 

