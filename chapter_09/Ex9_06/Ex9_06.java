import java.util.Random;

public class Ex9_06
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        assignRandomArrValues(arr);
//        System.out.println(Arrays.toString(arr));
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Time to selection sort array with 100,000 elements (in milliseconds): " + stopWatch.getElapsedTime());
//        System.out.println(Arrays.toString(arr));
    }

    private static int[] assignRandomArrValues(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(200000) - 100000;
        return arr;
    }

    private static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            // move boundary of unsorted subarray
            for (int j = i + 1; j < arr.length - 1; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // swap minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
