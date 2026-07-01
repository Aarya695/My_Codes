import java.util.*;

class Demo6 {

    static void pnz(int num) {
        if (num > 0)
            System.out.println("Number is positive!");
        else if (num < 0)
            System.out.println("Number is negative!");
        else
            System.out.println("Number is Zero");
    }

    static void EvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is odd!");
    }

    static boolean isDivisible(int num) {
        if (num % 2 == 0 && num % 8 == 0){
            System.out.println("Is divisible by 2 and 8");
            return true;
        }
        else{
            System.out.println("Is not divisible by 2 and 8");
            return false;
        }
    }

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i % num == 0) {
                if (i == num) {
                    count++;
                } else
                    count = count + 2;
            }
        }
        if (count == 2) {
            return true;
        } else
            return false;
    }

    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println("Sum of digits is:");
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        pnz(num);
        EvenOdd(num);
        System.out.println(isDivisible(num));
        System.out.println(isPrime(num));
        System.out.println(sumDigits(num));
    }
}