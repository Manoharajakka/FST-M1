
import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args)
    {

        int[] array = {4,7,5,1,3,2,6,9,8};

        System.out.println("input array :" + Arrays.toString(array));

        int i;

        int j;

        for(i=0; i<=array.length-1; i++)
        {

            for(j=i+1;j<array.length;j++)
            {

                int temp=0;
                if(array[i]>array[j])
                {
                    temp = temp + array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println("Sorted array" + Arrays.toString(array));
    }
}

