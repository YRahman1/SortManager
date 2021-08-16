package Binary;

import Sorters.Sortable;

public class BinaryTree implements Sortable
{
    Node root;
    public BinaryTree()
    {
        root = null;
    }

    public int[] sortArray(int[] arrayToSort)
    {
        insertArray(arrayToSort);
        inorder();
        System.out.print("\n");
        return new int[0];
    }

    void insert(int key)
    {
        root = insertRec(root, key);
    }

    void insertArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            root = insertRec(root, array[i]);
        }
    }

    Node insertRec(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }

        if (value < root.value)
            root.leftChild = insertRec(root.leftChild, value);
        else if (value > root.value)
            root.rightChild = insertRec(root.rightChild, value);

        return root;
    }


    void inorder()
    {
        inorderRec(root);
    }

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.leftChild);
            System.out.print(root.value + ", ");
            inorderRec(root.rightChild);
        }
    }
}

