import java.io.*;

class Demo10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of passengers: ");
        int num = Integer.parseInt(br.readLine());
        int choice = 0;
        int totalFair = 0;
        do {
            System.out.println("1. Ordinary - Rs 200");
            System.out.println("2. Semi-Luxury - Rs 350");
            System.out.println("3. Luxury - Rs 500");
            System.out.println("4. Sleeper - Rs 800");
            System.out.println("5. Exit");

            System.out.println("Select option: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    totalFair = 200 * num;
                    break;
                case 2:
                    totalFair = 350 * num;
                    break;
                case 3:
                    totalFair = 500 * num;
                    break;
                case 4:
                    totalFair = 800 * num;
                    break;
                case 5:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Wrong input!");
            }
            if (choice < 5) {
                if (num > 4) {
                    totalFair = totalFair - (10 * totalFair) / 100;
                }
                System.out.println("Your total fair to be paid is: Rs " + totalFair);
            }

        } while (choice != 5);

    }
}