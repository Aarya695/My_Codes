import java.util.*;

class Demo5 {

    static boolean isEligible(int age, double income, int cibl, boolean hasLoan) {
        // boolean pass = false;
        boolean fail = true;
        if (age < 21) {
            fail = false;
            System.out.println("Rejected as age is less than 21");
        }
        if (income < 30000) {
            fail = false;
            System.out.println("Rejected because income is less than 30k");
        }
        if (cibl < 750) {
            fail = false;
            System.out.println("Rejected because CIBL is less than 750!");
        }
        if (hasLoan) {
            fail = false;
            System.out.println("Rejected because you have pending loan!");
        }
        // if (age >= 21) {
        // pass = true;
        // } else {
        // fail = false;
        // System.out.println("Rejected as age is less than 21");
        // }
        // if (income >= 30000) {
        // pass = true;
        // } else {
        // fail = false;
        // System.out.println("Rejected because income is less than 30k");
        // }
        // if (cibl >= 750) {
        // pass = true;
        // } else {
        // fail = false;
        // System.out.println("Rejected because CIBL is less than 750!");
        // }
        // if (hasLoan) {
        // fail = false;
        // System.out.println("Rejected because you have pending loan!");
        // } else {
        // pass = true;
        // }
        // if(age>=21 && income >=30000 && cibl >=750 && hasLoan == "no"){
        // return true;
        // }
        // return false;
        return fail;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter monthly salary: ");
        double mIncome = sc.nextDouble();
        System.out.println("Enter CIBL Score: ");
        int cibl = sc.nextInt();
        // System.out.println("Have any existing lone?(yes/no)");
        // String ans = sc.next();
        // boolean hasLoan = ans;
        // if (ans == "yes" || ans == "Yes") {
        // hasLoan = true;
        // }
        System.out.println("Have any existing lone?(true if yes, false if no)");
        boolean ans = sc.nextBoolean();
        boolean hasLoan = ans;
        if (isEligible(age, mIncome, cibl, hasLoan)) {
            System.out.println("Eligible for loan!");
        } else {
            System.out.println("Not eligible for loan!");
        }
    }
}