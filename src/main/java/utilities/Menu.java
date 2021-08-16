package utilities;

import java.util.Scanner;

public class Menu
{

    // In this method, we Display the menu options and return the maximum number of options
    //This is not an automated process so we  must add the function here and increase the max option by 1.
    private int displayMenu()
    {
        int maxOption = 6;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Welcome to the Array Sorter. Please select one of the options below:");
        System.out.println("1.Bubble Sort");
        System.out.println("2.Insertion Sort");
        System.out.println("3.Binary Sort");
        System.out.println("4.Quick Sort");
        System.out.println("5.Selection Sort");
        System.out.println("6.Merge Sort");
        System.out.println("---------------------------------------------------------------------");
        return maxOption;
    }
    private int getOption(int max)
    {
        int option = 0;
        int test = 0;

        while(option < 1 || option > max)
        {
            option = getInputInt("Please enter a number between 1 and " + max);
        }
        return option;
    }

    public int getInputInt(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }
    //The runMenu() method is used to put all the methods together.
    //The timer is not working as it should, as of now.
    //We use the factory here and the toSort method in the interface to sort an array.
    //We make an array and display it using the array maker.
    public void runMenu()
    {
        arrayMaker a = new arrayMaker();
        SortableFactory s = new SortableFactory();
        Timer t = new Timer(); //NOT WORKING
        int userOption;

        userOption = getOption(displayMenu());
        int arraySize = getInputInt("Please enter the number of elements:");
        int[] unsortedArray = a.makeArray(arraySize);
        int[] sortedArray = t.getTimeNano( SortableFactory.getSorter(userOption),unsortedArray);
        a.displayArray( sortedArray);

        return;
    }
}
