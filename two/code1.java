import java.io.*;

class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}