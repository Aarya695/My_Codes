import java.util.*;

class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element" + (i + 1) + " :");
            arr[i] = sc.nextInt();
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(num + " has appeared " + count + " times!");

    }
}