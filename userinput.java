import java.util.Scanner;

public class UserInput{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to print:");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("Invalid - put at least 1 number");
            return;
        }

        System.out.println("Enter the first number:");
        int number = sc.nextInt();
        int smallest = number;
        int largest = number;

        for (int i = 1; i < count; i++) {
            System.out.println("Enter next number:");
            number = sc.nextInt();

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("\nResults");
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        sc.close();
    }
}
