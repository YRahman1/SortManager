package utilities;

public class arrayMaker
{
    //When making the array this function takes the number of elements and returns an array of that size.
    public static int[] makeArray(int numberOfElements)
    {
        int[] newArray = new int[numberOfElements];
        int min = 0;
        int max = 100;
        int range = max - min + 1;

        for(int i = 0; i < numberOfElements; i++)
        {
            newArray[i] = (int)(Math.random() * range);
        }
        System.out.println("This is your unsorted array: ");
        displayArray(newArray);
        return newArray;
    }
    //If the user doesnt enter anything than the default is 10
    public static int[] makeArray()
    {
        int[] newArray = new int[10];
        int min = 0;
        int max = 100;
        int range = max - min + 1;

        for(int i = 0; i < 10; i++)
        {
            newArray[i] = (int)(Math.random() * range);
        }
        System.out.println("This is your unsorted array: ");
        displayArray(newArray);
        return newArray;
    }

    public static void displayArray(int[] printArray)
    {
        if(printArray != null)
        {
            System.out.print("");
            for (int i = 0; i < printArray.length; i++)
            {
                System.out.print(printArray[i]);
                if (i != printArray.length - 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }

    }
}
