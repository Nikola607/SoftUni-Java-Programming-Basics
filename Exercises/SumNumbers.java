import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());
        int currentSum = 0;

        while (currentSum < sum) {
            int currentNumbers = Integer.parseInt(scan.nextLine());
            currentSum += currentNumbers;
        }
        System.out.println(currentSum);
    }
}
