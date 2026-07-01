import java.io.*;

class Demo8 {

    static int fineCal(int days) {
        int fine = 0;
        if (days == 0) {
            System.out.println("No fine!");
        } else if (days <= 5) {
            fine = (2 * days);
            System.out.println("Fine is Rs " + fine);
        } else if (days <= 10) {
            fine = 10 + (5 * (days - 5));
            System.out.println("Fine is Rs " + fine);
        } else if (days > 10) {
            fine = 10 + 25 + (10 * (days - 10));
            System.out.println("Fine is Rs " + fine);
        }
        return fine;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter student name: ");
        String name = br.readLine();
        System.out.println("Enter Book name: ");
        String bookName = br.readLine();
        System.out.println("Enter number of days the book is overdue: ");
        int days = Integer.parseInt(br.readLine());
        System.out.println(fineCal(days));
    }
}