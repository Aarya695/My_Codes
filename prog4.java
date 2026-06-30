import java.util.*;
class Demo4{

    static void displayDetails(String empName, String empID, double netSalary){
        System.out.println("Employee name: "+empName);
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Net-Salary: "+netSalary);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee name: ");
        String empName = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        System.out.println("Enter Employee Basic Salary: ");
        double empSal = sc.nextDouble();

    }
}