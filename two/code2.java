import java.io.*;

class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of integers: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter integer" + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all numbers is: " + sum);
        double average = (double) sum / size;
        System.out.println("Average of elements is: " + average);
    }
}