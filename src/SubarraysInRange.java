import java.util.ArrayList;
import java.util.Scanner;

public class SubarraysInRange {
    public static void subarray(int[] array,int left,int right)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            result.add(array[i]);
        }
        for(int i:result)
        {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();;
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        int left=scanner.nextInt();
        int right=scanner.nextInt();
        subarray(array,left,right);
    }
}
