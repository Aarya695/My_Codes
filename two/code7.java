import java.io.*;

class Demo7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter size: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENter element" + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
        }
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}