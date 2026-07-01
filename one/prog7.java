import java.util.*;

class Demo7 {

    static void attendancePercent(int totalDays, int daysPresent) {
        double percentage = ((double) daysPresent / totalDays) * 100;
        String result;
        if (percentage > 90) {
            result = "Excellent";
            System.out.println(result + " Bonas Rs 5000");
        } else if (percentage > 75) {
            result = "Good";
            System.out.println(result + " Bonas Rs 3000");
        } else if (percentage > 65) {
            result = "Average";
            System.out.println(result + " Bonas Rs 1000");
        } else {
            result = "Poor";
            System.out.println(result + " No Bonas!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter total working days: ");
        int totalDays = sc.nextInt();
        System.out.println("Enter days present: ");
        int daysPresent = sc.nextInt();
        attendancePercent(totalDays, daysPresent);
    }
}