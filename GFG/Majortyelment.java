package GFG;

public class Majortyelment 
{
    static int majorityElement(int a[], int size)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
