import java.util.*;

class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter size of array2: ");
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("element" + (i + 1) + " of array1:");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("element" + (i + 1) + " of array2:");
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else
                arr3[i] = arr2[i - arr1.length];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}