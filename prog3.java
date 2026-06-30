import java.util.*;
class Demo3{

    static double bill(int unit){
        double billamt = 0;
        if(unit<=100){
            billamt = 5*unit;
        } else if(100< unit && unit<=200){
            int nextunits = unit - 100;
            billamt = (5*100) + (7* nextunits);
        } else{
            int remainUnits = unit - 200;
            billamt = 500+700+ (10*remainUnits);
        }
        return billamt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter units consumed: ");
        int unit = sc.nextInt();
        double billamt = bill(unit);
        double gstBillamt = billamt + (18*billamt/100);
        double finalBill = gstBillamt;
        if(gstBillamt>5000){
            finalBill = gstBillamt - (5*gstBillamt/100);
        }
        System.out.println("Bill amount to be paid is "+finalBill);
    }
}