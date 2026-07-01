import java.io.*;

class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enterg size: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element" + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even elements: " + count);
        System.out.println("Number of odd elements: " + (arr.length - count));
    }
}