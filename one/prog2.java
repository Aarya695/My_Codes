import java.util.*;

class Demo2 {
    static int ogPin = 4353;
       static double balance = 15665;

    static int verification(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();
        if(pin == ogPin){
        System.out.println("Verification Successful!");
        }else{
            System.out.println("Please enter correct pin!");
            verification();
        }
        return 1;
    }
    public static void main(String[] args) {
        int res = verification();
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your pin: ");
        // int pin = sc.nextInt();
        // if(pin == ogPin){
        // System.out.println("Verification Successful!");

        boolean q = true;
        do {
            // System.out.println("Enter your pin: ");
            // int pin = sc.nextInt();
            // choice = 0;
            if (res == 1) {
                //System.out.println("Verification Successful!");

                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change Pin");
                System.out.println("5. Exit");
                System.out.println("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your bank balance is: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to be deposited: ");
                        double deposit = sc.nextDouble();
                        balance = balance + deposit;
                        System.out.println("Current balance: " + balance);
                        break;
                    case 3:
                        System.out.println("Enter amount to be withdrawl: ");
                        double withdrawl = sc.nextDouble();
                        if (withdrawl <= balance) {
                            balance = balance - withdrawl;
                            System.out.println("Current balance: " + balance);
                        } else
                            System.out.println("Insufficient Bank Balance!");
                        break;
                    case 4:
                        System.out.println("Enter new pin: ");
                        ogPin = sc.nextInt();
                        System.out.println("Pin changed successfully!");
                        break;
                     case 5:
                        System.out.println("Exit.. ");
                        q = false;
                        break;
                    default:
                        System.out.println("Thank you!!");
                }
            } 
        } while (q);

        // }else
        // System.out.println("Please enter correct pin!");

    }
}