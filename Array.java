
import java.util.*;

class Array{
    static int count;


    public static void printSubsequences(int[] arr, int index,
                                         ArrayList<Integer> path)
    {


        if (index == arr.length)
        {

            if (path.size() > 0) {
                int sum = 0;
                for (int i : path) {
                    sum += i;
                }
                if (sum < 0) {
                    count++;
                }
            }
        }

        else
        {

            printSubsequences(arr, index + 1, path);

            path.add(arr[index]);


            printSubsequences(arr, index + 1, path);


            path.remove(path.size() - 1);
        }
        return;
    }


    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3 ,-1, -3};

        ArrayList<Integer> path = new ArrayList<>();

        printSubsequences(arr, 0, path);

        System.out.println(count);
    }
}


