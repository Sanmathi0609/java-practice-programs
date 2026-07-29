import java.util.Arrays;

public class Swap_pos {
    public static void main ( String [] args)
    {
        int[]arr={1,2,3,4,5};
        int a=1;
        int b=3;
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
