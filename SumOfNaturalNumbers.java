import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        
        int sum = 0; 
        int i = 1;

        while (i <= n) {
            sum += i; 
            i++; 
        }

        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        scanner.close(); 
    }
}
