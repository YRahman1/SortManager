package Binary;

public class Node
{
    public final int value;
    public Node leftChild;
    public Node rightChild;

    public Node(int value)
    {
        this.value = value;
    }

    public Node getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(Node leftChild)
    {
        this.leftChild = leftChild;
    }

    public Node getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(Node rightChild)
    {
        this.rightChild = rightChild;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isLeftChildEmpty()
    {
        if(leftChild == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isRightChildEmpty()
    {
        if(rightChild == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}