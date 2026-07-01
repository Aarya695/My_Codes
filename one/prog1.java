import java.util.*;
class Demo1{

    static int totalMarks(int marks[]){
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        return sum;
    }

    static double percentage(int sum){
        return (sum/300.0)*100;
    }

    static boolean subPF(int marks[]){
        int count = 0;
        for(int i = 0; i< marks.length; i++){
            if(marks[i]<30){
                count++;
            }
        }
        if(count>1){
            return true;
        }else
            return false;
    }

    static void grade(double percentage){
        if(percentage>90){
            System.out.println("A Grade");
        } else if(percentage>80){
            System.out.println("B Grade");
        } else if(percentage > 70){
            System.out.println("C Grade");
        } else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter  roll number: ");
        int roll = sc.nextInt();
        int marks[] = new int[5];
        for(int i = 1; i<=5; i++){
        System.out.println("Enter marks obtained by Subject"+i+": ");
        marks[i-1] = sc.nextInt();
        }

        System.out.println("Total marks obtained: "+ totalMarks(marks));
        double percentage = percentage(totalMarks(marks));
        System.out.println("Percentage: "+percentage);
        if(subPF(marks)){
            System.out.println("Failed!!!");
        }else{
            grade(percentage);
        }
    }
}