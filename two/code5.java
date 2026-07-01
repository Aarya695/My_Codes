import java.io.*;

class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element" + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > 0) {
                countP++;
            } else if (arr[i] < 0) {
                countN++;
            } else
                countZ++;
        }
        System.out.println("Number of positives: " + countP);
        System.out.println("Number of negatives: " + countN);
        System.out.println("Number of zeros: " + countZ);
    }
}