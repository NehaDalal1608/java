public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // divisible by i, not prime
            }
        }

        return true; // prime
    }

    public static void main(String[] args) {
        // Let's check prime numbers from 1 to 50
        System.out.println("Prime numbers between 1 and 50 are:");

        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}