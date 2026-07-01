import java.util.*;

class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter size of array2: ");
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        boolean match = true;
        if (arr1.length != arr2.length) {
            match = false;
        } else {

            for (int i = 0; i < arr1.length; i++) {
                System.out.println("element" + (i + 1) + " of array1:");
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("element" + (i + 1) + " of array2:");
                arr2[i] = sc.nextInt();
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != (arr2[i])) {
                    match = false;
                }
            }
        }

        if (match) {
            System.out.println("Arrays are equal!!");
        } else
            System.out.println("Arrays are not equal!");
    }
}