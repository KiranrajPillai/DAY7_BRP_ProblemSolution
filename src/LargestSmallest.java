import java.util.Arrays;

public class LargestSmallest {
    public static void main(String []args){
        int a;
        int arr[] = {12,16,1,25,100,78,89,22};
        System.out.println("Array = "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays in ascending order:" +Arrays.toString(arr));
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("Smallest: "+arr[0]);
        System.out.println("Largest: "+arr[count-1]);
        System.out.println("Second Smallest: "+arr[1]);
        System.out.println("Second Largest: "+arr[count-2]);
    }
}
