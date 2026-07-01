import java.util.*;

class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Age must be atleast 18 years!");
        } else {
            sc.nextLine();
            System.out.println("Enter student course: ");
            String course = sc.nextLine();
            System.out.println("Enter student exam fee: ");
            double fee = sc.nextDouble();
            if (fee <= 0) {
                System.out.println("Exam fee must be greater than 0!");
            } else {
                if (fee > 5000) {
                    System.out.println("You get 10% concession!");
                    fee = fee - (10 * fee) / 100;
                }
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Course: " + course);
                System.out.println("Fees to be paide is " + fee + " Rupees!");
            }
        }
    }
}