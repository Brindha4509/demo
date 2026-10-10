
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Needs Improvement");
        }

        sc.close();
    }
}
