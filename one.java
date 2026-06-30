import java.util.*;

class Demo {
    void printData(String name, int age, String clg, double height, double weight) {
        System.out.println("Data of Person1:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + clg);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Heyy " + name);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your College name: ");
        String clg = sc.next();
        sc.next();
        System.out.println("Enter your height(in cm): ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();
        Demo obj = new Demo();
        obj.printData(name, age, clg, height, weight);
    }
}