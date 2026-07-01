import java.io.*;

public class code3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of integers: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter integer" + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}
