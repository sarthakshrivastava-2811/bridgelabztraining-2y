import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not an Armstrong number");
        } else {
            int original = n;
            int digits = String.valueOf(n).length();
            int sum = 0;
            int count = n;

            while (count > 0) {
                int rem = count % 10;
                sum += Math.pow(rem, digits);
                count = count / 10;
            }

            if (sum == original) {
                System.out.println(" is an Armstrong number");
            } else {
                System.out.println(" is NOT an Armstrong number");
            }
        }

    }
}