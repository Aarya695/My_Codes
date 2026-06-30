import java.util.*;

class Demo5 {

    static boolean isEligible(int age, double income, int cibl, String hasLoan) {
        if(age>=21 && income >=30000 && cibl >=750 && hasLoan == no){
            return true;
        }
        return false;
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
        System.out.println("Have any existing lone?(yes/no)");
        String hasLoan = sc.next();
        if(isEligible(age, mIncome, cibl, hasLoan)){
            System.out.println("Eligible for loan!");
        }else{
            System.out.println("Not eligible for loan!");
            System.out.println("Rejected because all load eligibility rules not fulfilled!(age>=21, income>=Rs 30,000, CIBL>=750, No existing loan");
        }
    }
}