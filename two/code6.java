import java.util.*;

class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element" + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search: ");
        int search = sc.nextInt();
        boolean notFound = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                notFound = false;
                System.out.println("Number is found at index " + i);
                break;
            }
        }
        if (notFound)
            System.out.println("Number not found!");
    }
}